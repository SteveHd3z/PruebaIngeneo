package com.injeneo.prueba.controller;



import com.injeneo.prueba.model.domain.Cliente;
import com.injeneo.prueba.model.service.ClienteService;
import com.injeneo.prueba.utilities.MyResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private MyResponseUtility response;

    @PostMapping(path = "/createClient")
    public ResponseEntity<MyResponseUtility>  createClient(@RequestBody Cliente cliente){

        response.data=clienteService.create(cliente);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/getAllClient")
    public ResponseEntity<MyResponseUtility>  getAllClient(){

        response.data=clienteService.getAll();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
