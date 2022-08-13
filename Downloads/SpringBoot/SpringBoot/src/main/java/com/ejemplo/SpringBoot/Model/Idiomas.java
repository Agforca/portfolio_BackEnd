package com.ejemplo.SpringBoot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Idiomas {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombreIdioma;
    private Integer porcentajeIdioma;
    
//Constructores

    public Idiomas() {
    }

    public Idiomas(Integer id, String nombreIdioma, Integer porcentajeIdioma) {
        this.id = id;
        this.nombreIdioma = nombreIdioma;
        this.porcentajeIdioma = porcentajeIdioma;
    }
    
}
