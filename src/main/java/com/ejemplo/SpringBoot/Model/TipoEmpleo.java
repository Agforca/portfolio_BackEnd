package com.ejemplo.SpringBoot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoEmpleo {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre_tipo;
    
//Constructores

    public TipoEmpleo() {
    }

    public TipoEmpleo(Integer id, String nombre_tipo) {
        this.id = id;
        this.nombre_tipo = nombre_tipo;
    }
    
}
