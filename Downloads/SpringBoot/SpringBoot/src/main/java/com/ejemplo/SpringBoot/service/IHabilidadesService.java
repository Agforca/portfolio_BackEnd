package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Habilidades;
import java.util.List;


public interface IHabilidadesService {
    
    public List<Habilidades> verHabilidades();
    
    public void crearHabilidad (Habilidades habi);
    
    public void borrarHabilidad (Integer id);
    
    public Habilidades buscarHabilidades (Integer id);
    
}
