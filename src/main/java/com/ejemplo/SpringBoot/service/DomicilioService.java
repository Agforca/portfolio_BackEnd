package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Domicilio;
import com.ejemplo.SpringBoot.repository.DomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService implements IDomicilioService {
    
    @Autowired
    public DomicilioRepository domiRepo;

    @Override
    public List<Domicilio> verDomicilios() {
        return domiRepo.findAll();
    }

    @Override
    public void crearDomicilio(Domicilio domi) {
        domiRepo.save(domi);
    }

    @Override
    public void borrarDomicilio(Integer id) {
        domiRepo.deleteById(id);
    }

    @Override
    public Domicilio buscarDomicilio(Integer id) {
        return domiRepo.findById(id).orElse(null);
    }
    
}
