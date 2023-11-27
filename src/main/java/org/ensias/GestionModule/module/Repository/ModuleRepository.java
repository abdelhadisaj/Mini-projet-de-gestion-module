package org.ensias.GestionModule.module.Repository;

import org.ensias.GestionModule.module.Entity.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository <ModuleModel, Integer> {
}
