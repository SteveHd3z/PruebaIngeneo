package com.injeneo.prueba.model.repository;

import com.injeneo.prueba.model.domain.Terrestre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerrestreRepository extends JpaRepository<Terrestre,Integer> {
}
