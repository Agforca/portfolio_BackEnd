package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona (Persona pers);
    
    public void borrarPersona (Integer id);
    
    public Persona buscarPersona (Integer id);
    
    public void editarPersona (Persona pers);
    
    
}
