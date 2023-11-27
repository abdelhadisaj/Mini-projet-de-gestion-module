package org.ensias.GestionModule.module.Controllers;

import org.ensias.GestionModule.module.Entity.ModuleModel;
import org.ensias.GestionModule.module.Services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModuleController {
    @Autowired
    private ModuleService ms;
    @GetMapping("/modules")
    public List<ModuleModel> getModules(){
        return ms.getModules();
    }

    @GetMapping("/module")
    public void getModule(@RequestParam Integer id){
        ms.getModule(id);
    }

    @PostMapping("/add-module")
    public void addModule(@RequestBody ModuleModel module){
        ms.ajouterModule(module);
    }
    @PutMapping("/set-module")
    public void setModule(@RequestBody ModuleModel module){
        ms.modifierModule(module);
    }

    @DeleteMapping("/delete-module")
    public void deleteModule(@RequestParam Integer id){
        ms.supprimerModule(id);
    }
}
