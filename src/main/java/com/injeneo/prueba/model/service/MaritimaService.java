package com.injeneo.prueba.model.service;

import com.injeneo.prueba.model.domain.Envio;
import com.injeneo.prueba.model.domain.Maritima;
import com.injeneo.prueba.model.repository.EnvioRepository;
import com.injeneo.prueba.model.repository.MaritimaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MaritimaService {

    @Autowired
    private MaritimaRepository maritimaRepository;


    public Maritima create(Maritima maritima){
        return maritimaRepository.save(maritima);
    }

    @Transactional(readOnly = true)
    public List<Maritima> getAll() {
        return maritimaRepository.findAll();
    }

}
