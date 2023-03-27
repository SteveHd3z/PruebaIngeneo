package com.injeneo.prueba.model.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="productos")
public class Producto {

    @Id
    @Column(name = "idProducto", nullable = false)
    private Integer idProducto;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "idCliente", nullable = false)
    private Integer idCliente;

    @Column(name = "idEnvio", nullable = false)
    private Integer idEnvio;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Cliente.class)
    @JoinColumn(name="idCliente", nullable = false, insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Envio.class)
    @JoinColumn(name="idEnvio", nullable = false, insertable = false, updatable = false)
    private Envio envio;

}
