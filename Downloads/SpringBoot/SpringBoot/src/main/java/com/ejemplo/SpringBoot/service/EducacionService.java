package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Educacion;
import com.ejemplo.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educaRepo;

    @Override
    public List<Educacion> verEducaciones() {
        return educaRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educ) {
        educaRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Integer id) {
        educaRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Integer id) {
        return educaRepo.findById(id).orElse(null);
    }
    
}
