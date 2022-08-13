package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.Model.TipoEmpleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpleoRepository extends JpaRepository <TipoEmpleo, Integer>{
    
}
