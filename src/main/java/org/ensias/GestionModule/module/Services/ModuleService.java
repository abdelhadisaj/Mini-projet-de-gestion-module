package org.ensias.GestionModule.module.Services;

import org.ensias.GestionModule.module.Entity.ModuleModel;
import org.ensias.GestionModule.module.Repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepo;

    //    methode pour recuperer tout les modules
    public List<ModuleModel> getModules(){
        List<ModuleModel> modules = new ArrayList<>();
        moduleRepo.findAll().forEach(modules::add);
        return modules;
    }

    //    methode pour recuperer un module par identifiant
    public Optional<ModuleModel> getModule(Integer id) {
        return moduleRepo.findById(id);
    }

    //    methode pour ajouter le module
    public void ajouterModule(ModuleModel Module){
         moduleRepo.save(Module);
    }

    //    methode pour modifier le module par identifiant
    public void modifierModule(ModuleModel Module){
        moduleRepo.save(Module);
    }

    //    methode pour supprimer le module par identifiant
    public void supprimerModule(Integer id){
        moduleRepo.deleteById(id);
    }

}
