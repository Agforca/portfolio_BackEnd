package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.Model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository <Domicilio, Integer> {
    
}
