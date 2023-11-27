package org.ensias.GestionModule.cours.service;

import org.ensias.GestionModule.cours.entity.CoursModel;
import org.ensias.GestionModule.cours.repository.CoursRepository;
import org.ensias.GestionModule.module.Entity.ModuleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoursService {

    @Autowired
    CoursRepository cr;

   public List<CoursModel> getAllCourses(Integer idmodule){
       List<CoursModel> cours = new ArrayList<>();
       cr.findByModuleId(idmodule).forEach(cours::add);
       return cours;
   }

   public Optional<CoursModel> getCours(Integer id){
       return cr.findById(id);
   }

   public void ajouterCours(CoursModel cours){
       cr.save(cours);
   }

   public void modifierCours(CoursModel cours){
       cr.save(cours);
   }

   public void supprimerCours(Integer id){
       cr.deleteById(id);
   }
}
