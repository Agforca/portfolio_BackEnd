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
public class Persona {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String domicilio;
    private Date fechaNac;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private Blob url_foto;
    
//Constructores

    public Persona() {
    }
    
    public Persona(Integer id, String nombre, String apellido, String profesion, String domicilio, Date fechaNac, String telefono, String correo, String sobre_mi, Blob url_foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
    }
    
}
