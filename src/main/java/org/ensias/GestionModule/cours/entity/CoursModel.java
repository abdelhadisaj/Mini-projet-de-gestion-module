package org.ensias.GestionModule.cours.entity;

import jakarta.persistence.*;
import org.ensias.GestionModule.module.Entity.ModuleModel;

@Table(name="cours")
@Entity
public class CoursModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cours;
    private String nom_cours;
    private String description_cours;
    @ManyToOne
    private ModuleModel module;

    public CoursModel() {
    }

    public CoursModel(int id_cours, String nom_cours, String description_cours, int moduleId) {
        this.id_cours = id_cours;
        this.nom_cours = nom_cours;
        this.description_cours = description_cours;
        this.module = new ModuleModel(moduleId,"","");
    }

    public int getId_cours() {
        return id_cours;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public String getNom_cours() {
        return nom_cours;
    }

    public void setNom_cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }

    public String getDescription_cours() {
        return description_cours;
    }

    public void setDescription_cours(String description_cours) {
        this.description_cours = description_cours;
    }

    public ModuleModel getModule() {
        return module;
    }

    public void setModule(ModuleModel module) {
        this.module = module;
    }
}
