package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Usuario;
import com.ejemplo.SpringBoot.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usurRepo; 

    @Override
    public List<Usuario> verUsuario() {
        return usurRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario usur) {
        usurRepo.save(usur);
    }

    @Override
    public void borrarUsuario(Integer id) {
        usurRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Integer id) {
        return usurRepo.findById(id).orElse(null);
    }
    
}
