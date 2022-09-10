package com.ejemplo.SpringBoot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Domicilio {
    
//Declaración de atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String calle;
    private Integer numero;
    private String piso;
    private String departamento;
    private String localidad;
    private String provincia;
    private String pais;
    private Integer codigoPostal;
    
//Constructores

    public Domicilio() {
    }

    public Domicilio(Integer id, String calle, Integer numero, String piso, String departamento, String localidad, String provincia, String pais, Integer codigoPostal) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }
    
}
