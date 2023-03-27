package com.injeneo.prueba.model.service;


import com.injeneo.prueba.model.domain.Producto;
import com.injeneo.prueba.model.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public Producto create(Producto producto){
        return productoRepository.save(producto);
    }

    @Transactional(readOnly = true)
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

}
