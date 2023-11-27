package org.ensias.GestionModule.cours.controlleur;

import org.ensias.GestionModule.cours.entity.CoursModel;
import org.ensias.GestionModule.cours.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CoursController {
    @Autowired
    CoursService cs;
    @GetMapping("/allcourses")
    public List<CoursModel> getAllCourses(@RequestParam Integer Module_id){
        return cs.getAllCourses(Module_id);
    }
    @GetMapping("/getcours")
    public Optional<CoursModel> getCourse(@RequestParam Integer id){
        return cs.getCours(id);
    }
    @PostMapping("add-cours")
    public void addCourse(@RequestBody CoursModel cours){
        cs.ajouterCours(cours);
    }

    @PutMapping("set-cours")
    public void updateCourse(@RequestBody CoursModel cours){
        cs.modifierCours(cours);
    }
    @DeleteMapping("delete-course")
    public void deleteCourse(@RequestParam Integer id){
        cs.supprimerCours(id);
    }


}
