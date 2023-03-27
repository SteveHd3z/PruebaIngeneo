package com.injeneo.prueba.controller;


import com.injeneo.prueba.model.domain.Cliente;
import com.injeneo.prueba.model.domain.Producto;
import com.injeneo.prueba.model.service.ClienteService;
import com.injeneo.prueba.model.service.ProductoService;
import com.injeneo.prueba.utilities.MyResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
public class ProductoController {


    @Autowired
    private ProductoService productoService;

    @Autowired
    private MyResponseUtility response;

    @PostMapping(path = "/createProduct")
    public ResponseEntity<MyResponseUtility> createProduct(@RequestBody Producto producto){

        response.data = productoService.create(producto);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/getAllProduct")
    public ResponseEntity<MyResponseUtility>  getAllProduct(){

        response.data = productoService.getAll();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
