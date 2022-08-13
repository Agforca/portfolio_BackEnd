package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducaciones();
    
    public void crearEducacion (Educacion educ);
    
    public void borrarEducacion (Integer id);
    
    public Educacion buscarEducacion (Integer id);
    
}
