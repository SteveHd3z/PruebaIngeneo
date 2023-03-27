package com.injeneo.prueba.model.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name="envio")
public class Envio {

    @Id
    @Column(name = "idEnvio", nullable = false)
    private Integer IdEnvio;

    @Column(name = "fechaRegistro", nullable = false)
    private String fechaRegistro;

    @Column(name = "fechaEntrega", nullable = false)
    private String fechaEntrega;

    @Column(name = "precio", nullable = false)
    private Integer precio;

    @OneToMany(mappedBy = "idEnvio")
    @JsonBackReference(value = "idEnvio")
    private List<Producto> envio;

    @OneToOne(mappedBy = "envio")
    private Maritima maritima;

    @OneToOne(mappedBy = "envio")
    private Terrestre terrestre;
}
