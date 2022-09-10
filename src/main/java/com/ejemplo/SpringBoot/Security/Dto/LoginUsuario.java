package com.ejemplo.SpringBoot.Security.Dto;


public class LoginUsuario {
    
    //@NotBlank
    private String nombreUsuario;
    //@NotBlank
    private String password;
    
//Getters y Setters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
