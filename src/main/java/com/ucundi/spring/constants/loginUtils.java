package com.ucundi.spring.constants;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author AndresMiranda
 */

public class loginUtils {

    private loginUtils(){

    }
    public static ResponseEntity<String> getResponseEntity(String message, HttpStatus httpstatus){
        return new ResponseEntity<String>("Mensaje: "+message, httpstatus);
    }

}
