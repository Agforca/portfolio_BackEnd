package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
    
}
