package com.ejemplo.SpringBoot.Model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class ExperienciaLaboral {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombreEmpresa;
    private Integer esTrabajoActual;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    
//Constructores

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Integer id, String nombreEmpresa, Integer esTrabajoActual, Date fechaInicio, Date fechaFin, String descripcion) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }
    
}
