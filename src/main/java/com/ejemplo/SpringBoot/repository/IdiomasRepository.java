package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.Model.Idiomas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomasRepository extends JpaRepository <Idiomas, Integer> {
    
}
