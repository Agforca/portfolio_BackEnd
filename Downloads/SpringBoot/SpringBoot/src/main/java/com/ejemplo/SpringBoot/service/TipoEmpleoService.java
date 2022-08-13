package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.Model.TipoEmpleo;
import com.ejemplo.SpringBoot.repository.TipoEmpleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleoService implements ITipoEmpleoService{
    
    @Autowired
    public TipoEmpleoRepository tipoRepo;

    @Override
    public List<TipoEmpleo> verTipoEmpleo() {
        return tipoRepo.findAll();
    }

    @Override
    public void crearTipoEmpleo(TipoEmpleo tipo) {
        tipoRepo.save(tipo);
    }

    @Override
    public void borrarTipoEmpleo(Integer id) {
        tipoRepo.deleteById(id);
    }

    @Override
    public TipoEmpleo buscarTipoEmpleo(Integer id) {
        return tipoRepo.findById(id).orElse(null);
    }
    
}
