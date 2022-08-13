package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.Model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Integer>{
    
}
