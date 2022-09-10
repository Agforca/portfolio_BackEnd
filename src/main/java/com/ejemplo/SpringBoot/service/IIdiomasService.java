package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Idiomas;
import java.util.List;


public interface IIdiomasService {
    
    public List<Idiomas> verIdiomas();
    
    public void crearIdioma (Idiomas idio);
    
    public void borrarIdioma (Integer id);
    
    public Idiomas buscarIdioma (Integer id);
    
}
