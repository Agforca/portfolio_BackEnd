package com.ejemplo.SpringBoot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombreHabilidad;
    private Integer porcentajeHabilidad;
    
//Constructores

    public Habilidades() {
    }

    public Habilidades(Integer id, String nombreHabilidad, Integer porcentajeHabilidad) {
        this.id = id;
        this.nombreHabilidad = nombreHabilidad;
        this.porcentajeHabilidad = porcentajeHabilidad;
    }
    
}
