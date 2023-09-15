package com.ucundi.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class camasController {

    @GetMapping("/createCamas/{id}")
    public String addCamas(@PathVariable("id") String id){
        String regexforID = "[1-5 a-z]{1,5}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama adicionada satisfactoriamente "+id;
    }

    @GetMapping("/createCamas/")
    public String addCamas(){
        return "Cama adicionada satisfactoriamente";
    }

    @GetMapping("/readCamas")
    public String readCamas(){
        return "Cama consultada satisfactoriamente";
    }

    @GetMapping("/readCamas/{id}")
    public String readCamas(@PathVariable("id") String identificador){
        return "Cama consultada satisfactoriamente "+identificador;
    }

    @GetMapping("/updateCamas")
    public String updateCamas(){
        return "Cama actualizada satisfactoriamente";
    }

    @GetMapping("/deleteCamas")
    public String deleteCamas(){
        return "Cama eliminada satisfactoriamente";
    }

}
