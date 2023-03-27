package com.injeneo.prueba.utilities;

import org.springframework.stereotype.Component;

@Component // el decorador @component es la clase padre de todas las anotaciones; la cual inyectamos en el controlador, servicios y repositoty
public class MyResponseUtility {

    public Boolean error;
    public String message;
    public String descriptionError;
    public Object data;

    /**
     * La clase MyResponseUtility es una clase que
     * permite generar un objeto de tipo MyResponse
     */
    public MyResponseUtility() {
        this.error = false;
        this.message = "success";
        this.descriptionError = "Error null";
        this.data = null;
    }

    // este metodo restablece el listado de la peticion
    public void restart() {
        error = false;
        message = "Success";
        descriptionError = "Error null";
        data = null;
    }
}