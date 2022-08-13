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
public class Educacion {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombreInstitucion;
    private String titulo;
    private Date fechaInicio;
    private Date fechaFin;
    private Blob url_icono;
            
//Constructores

    public Educacion() {
    }
    
    public Educacion(Integer id, String nombreInstitucion, String titulo, Date fechaInicio, Date fechaFin, Blob url_icono) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.url_icono = url_icono;
    }
    
}
