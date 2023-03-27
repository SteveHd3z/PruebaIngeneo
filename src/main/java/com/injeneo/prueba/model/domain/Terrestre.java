package com.injeneo.prueba.model.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="terrestre")
public class Terrestre {

    @Id
    @Column(name = "idBodega", nullable = false)
    private Integer idBodega;

    @Column(name = "placa", nullable = false)
    private String placa;

    //@Column(name = "idEnvio", nullable = false)
    //private String id_Envio;

    @OneToOne
    @JoinColumn(name = "envio", nullable = false, insertable = false, updatable = false)
    private Envio envio;

}
