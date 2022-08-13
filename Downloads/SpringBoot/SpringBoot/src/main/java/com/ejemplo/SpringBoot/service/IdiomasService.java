package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.Idiomas;
import com.ejemplo.SpringBoot.repository.IdiomasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomasService implements IIdiomasService {
    
    @Autowired
    public IdiomasRepository idioRepo;

    @Override
    public List<Idiomas> verIdiomas() {
        return idioRepo.findAll();
    }

    @Override
    public void crearIdioma(Idiomas idio) {
        idioRepo.save(idio);
    }

    @Override
    public void borrarIdioma(Integer id) {
        idioRepo.deleteById(id);
    }

    @Override
    public Idiomas buscarIdioma(Integer id) {
        return idioRepo.findById(id).orElse(null);
    }
    
}
