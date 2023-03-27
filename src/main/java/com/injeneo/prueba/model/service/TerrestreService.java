package com.injeneo.prueba.model.service;

import com.injeneo.prueba.model.domain.Maritima;
import com.injeneo.prueba.model.domain.Terrestre;
import com.injeneo.prueba.model.repository.MaritimaRepository;
import com.injeneo.prueba.model.repository.TerrestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TerrestreService {

    @Autowired
    private TerrestreRepository terrestreRepository;


    public Terrestre create(Terrestre terrestre){
        return terrestreRepository.save(terrestre);
    }

    @Transactional(readOnly = true)
    public List<Terrestre> getAll() {
        return terrestreRepository.findAll();
    }


}
