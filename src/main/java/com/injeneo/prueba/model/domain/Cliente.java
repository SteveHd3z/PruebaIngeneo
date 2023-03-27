package com.injeneo.prueba.model.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="clientes")
public class Cliente{
    //private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "telefono", nullable = false)
    private String telefono;

    @OneToMany(mappedBy = "idCliente")
    @JsonBackReference(value = "idCliente")
    private List<Producto> cliente;

}
