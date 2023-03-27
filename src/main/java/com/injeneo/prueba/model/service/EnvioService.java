package com.injeneo.prueba.model.service;

import com.injeneo.prueba.model.domain.Envio;
import com.injeneo.prueba.model.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EnvioService {

    @Autowired
    private EnvioRepository envioRepository;


    public Envio create(Envio envio){
        return envioRepository.save(envio);
    }

    @Transactional(readOnly = true)
    public List<Envio> getAll() {
        return envioRepository.findAll();
    }

}
