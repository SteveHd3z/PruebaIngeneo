package com.injeneo.prueba.controller;

import com.injeneo.prueba.model.domain.Envio;
import com.injeneo.prueba.model.domain.Maritima;
import com.injeneo.prueba.model.service.EnvioService;
import com.injeneo.prueba.model.service.MaritimaService;
import com.injeneo.prueba.utilities.MyResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
public class MaritimaController {

    @Autowired
    private MaritimaService maritimaService;

    @Autowired
    private MyResponseUtility response;

    @PostMapping(path = "/createPuerto")
    public ResponseEntity<MyResponseUtility> createPuerto(@RequestBody Maritima maritima){

        response.data = maritimaService.create(maritima);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/getAllPuerto")
    public ResponseEntity<MyResponseUtility>  getPuerto(){

        response.data = maritimaService.getAll();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
