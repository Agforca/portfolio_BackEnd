package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Habilidades;
import com.ejemplo.SpringBoot.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    public HabilidadesRepository habiRepo;
    
    @Override
    public List<Habilidades> verHabilidades(){
        return habiRepo.findAll();
    }
    
    @Override
    public void crearHabilidad(Habilidades habi){
        habiRepo.save(habi);
    }
    
    @Override
    public void borrarHabilidad(Integer id){
        habiRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidades(Integer id) {
        return habiRepo.findById(id).orElse(null);
    }
    
    
}
