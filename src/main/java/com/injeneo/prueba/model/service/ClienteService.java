package com.injeneo.prueba.model.service;

import com.injeneo.prueba.model.domain.Cliente;
import com.injeneo.prueba.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente create(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Transactional(readOnly = true)
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }


}
