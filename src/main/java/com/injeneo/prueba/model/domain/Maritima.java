package com.injeneo.prueba.model.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="maritima")
public class Maritima {

    @Id
    @Column(name = "idPuerto", nullable = false)
    private Integer idPuerto;

    @Column(name = "numeroFlota", nullable = false)
    private int numeroFlot;

    //@Column(name = "idEnvio", nullable = false)
    //private int idEnvio;

    @OneToOne
    @JoinColumn(name = "envio", nullable = false, insertable = false, updatable = false)
    private Envio envio;
}
