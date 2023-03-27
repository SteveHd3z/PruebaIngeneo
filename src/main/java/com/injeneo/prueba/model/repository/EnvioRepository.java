package com.injeneo.prueba.model.repository;

import com.injeneo.prueba.model.domain.Envio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnvioRepository extends JpaRepository<Envio,Integer> {
}
