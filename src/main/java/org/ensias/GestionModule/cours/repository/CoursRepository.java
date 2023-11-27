package org.ensias.GestionModule.cours.repository;

import org.ensias.GestionModule.cours.entity.CoursModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoursRepository extends CrudRepository<CoursModel, Integer> {

    List<CoursModel> findByModuleId (Integer id);
}
