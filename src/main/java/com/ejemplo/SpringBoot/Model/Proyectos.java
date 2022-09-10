package com.ejemplo.SpringBoot.Model;

import java.sql.Blob;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombreProyecto;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcionProyecto;
    private Blob urlIconoProyecto;
    
//Constructores

    public Proyectos() {
    }

    public Proyectos(Integer id, String nombreProyecto, Date fechaInicio, Date fechaFin, String descripcionProyecto, Blob urlIconoProyecto) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionProyecto = descripcionProyecto;
        this.urlIconoProyecto = urlIconoProyecto;
    }
    
}
