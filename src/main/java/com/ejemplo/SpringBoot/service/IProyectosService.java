package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    
    public void crearProyecto (Proyectos proy);
    
    public void borrarProyecto (Integer id);
    
    public Proyectos buscarProyecto (Integer id);
    
}
