package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> verUsuario();
    
    public void crearUsuario (Usuario usur);
    
    public void borrarUsuario (Integer id);
    
    public Usuario buscarUsuario (Integer id);
    
}
