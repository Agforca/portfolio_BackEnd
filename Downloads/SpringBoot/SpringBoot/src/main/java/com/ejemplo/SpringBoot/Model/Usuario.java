package com.ejemplo.SpringBoot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String contrasena;
    
//Constructores

    public Usuario() {
    }

    public Usuario(Integer id, String email, String contrasena) {
        this.id = id;
        this.email = email;
        this.contrasena = contrasena;
    }
}
