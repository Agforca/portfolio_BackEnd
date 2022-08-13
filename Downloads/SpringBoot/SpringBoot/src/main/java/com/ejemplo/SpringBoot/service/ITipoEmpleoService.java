package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.TipoEmpleo;
import java.util.List;


public interface ITipoEmpleoService {
    
    public List<TipoEmpleo> verTipoEmpleo();
    
    public void crearTipoEmpleo (TipoEmpleo tipo);
    
    public void borrarTipoEmpleo (Integer id);
    
    public TipoEmpleo buscarTipoEmpleo (Integer id);
    
}
