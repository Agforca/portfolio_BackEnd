
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.Model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository <ExperienciaLaboral, Integer> {
    
}
