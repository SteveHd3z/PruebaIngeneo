package com.injeneo.prueba.model.repository;

import com.injeneo.prueba.model.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
