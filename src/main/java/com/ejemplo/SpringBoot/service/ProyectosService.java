package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Proyectos;
import com.ejemplo.SpringBoot.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    public ProyectosRepository proyRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Integer id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Integer id) {
        return proyRepo.findById(id).orElse(null);
    }
    
}
