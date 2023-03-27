package com.injeneo.prueba.model.repository;

import com.injeneo.prueba.model.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
