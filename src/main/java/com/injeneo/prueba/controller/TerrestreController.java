package com.injeneo.prueba.controller;


import com.injeneo.prueba.model.domain.Envio;
import com.injeneo.prueba.model.domain.Terrestre;
import com.injeneo.prueba.model.service.EnvioService;
import com.injeneo.prueba.model.service.TerrestreService;
import com.injeneo.prueba.utilities.MyResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
public class TerrestreController {

    @Autowired
    private TerrestreService terrestreService;

    @Autowired
    private MyResponseUtility response;

    @PostMapping(path = "/createBodega")
    public ResponseEntity<MyResponseUtility> createSend(@RequestBody Terrestre terrestre){

        response.data = terrestreService.create(terrestre);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/getAllBodega")
    public ResponseEntity<MyResponseUtility>  getAllSend(){

        response.data = terrestreService.getAll();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
