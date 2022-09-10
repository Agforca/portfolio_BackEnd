package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.ExperienciaLaboral;
import com.ejemplo.SpringBoot.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {

    @Autowired
    public ExperienciaLaboralRepository expeRepo;
    
    @Override
    public List<ExperienciaLaboral> verExperienciasLaborales() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperienciaLaboral(ExperienciaLaboral expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperienciaLaboral(Integer id) {
        expeRepo.deleteById(id);
    }

    @Override
    public ExperienciaLaboral buscarExperienciaLaboral(Integer id) {
        return expeRepo.findById(id).orElse(null);
    }
    
}
