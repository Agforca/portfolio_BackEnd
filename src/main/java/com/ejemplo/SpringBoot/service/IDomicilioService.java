package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Domicilio;
import java.util.List;


public interface IDomicilioService {
    
    public List<Domicilio> verDomicilios();
    
    public void crearDomicilio (Domicilio domi);
    
    public void borrarDomicilio (Integer id);
    
    public Domicilio buscarDomicilio (Integer id);
    
}
