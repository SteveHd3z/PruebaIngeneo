package com.injeneo.prueba.controller;


import com.injeneo.prueba.model.domain.Envio;
import com.injeneo.prueba.model.service.EnvioService;
import com.injeneo.prueba.utilities.MyResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
public class EnvioController {

    @Autowired
    private EnvioService envioService;

    @Autowired
    private MyResponseUtility response;

    @PostMapping(path = "/createSend")
    public ResponseEntity<MyResponseUtility> createSend(@RequestBody Envio envio){

        response.data = envioService.create(envio);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/getAllSend")
    public ResponseEntity<MyResponseUtility>  getAllSend(){

        response.data = envioService.getAll();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
