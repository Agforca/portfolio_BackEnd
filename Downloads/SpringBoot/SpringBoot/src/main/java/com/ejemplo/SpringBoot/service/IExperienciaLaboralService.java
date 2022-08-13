package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLaboralService {
    
    public List<ExperienciaLaboral> verExperienciasLaborales();
    
    public void crearExperienciaLaboral (ExperienciaLaboral expe);
    
    public void borrarExperienciaLaboral (Integer id);
    
    public ExperienciaLaboral buscarExperienciaLaboral (Integer id);
    
}
