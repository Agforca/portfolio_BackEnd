package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Integer>{
    
}
