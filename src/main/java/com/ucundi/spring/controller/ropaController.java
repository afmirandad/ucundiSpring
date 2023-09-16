package com.ucundi.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AndresMiranda
 */
@RestController
@RequestMapping("/api")
public class ropaController {
    
    @GetMapping("/createRopas")
    public String createRopas(){
        return "Ropa creada satisfactoriamente";
    }
    @GetMapping("/createRopas/{id}")
    public String createRopas(@PathVariable("id") String id){
        return "Ropa creada satisfactoriamente";
    }
    @GetMapping("/readRopas")
    public String readRopas(){
        return "Ropa consultada satisfactoriamente";
    }
    @GetMapping("/readRopas/{id}")
    public String readRopas(@PathVariable("id") String id){
        return "Ropa consultada satisfactoriamente";
    }
    @GetMapping("/updateRopas")
    public String updateRopas(){
        return "Ropa actualizada satisfactoriamente";
    }
    @GetMapping("/updateRopas/{id}")
    public String updateRopas(@PathVariable("id") String id){
        return "Ropa actualizada satisfactoriamente";
    }
    @GetMapping("/deleteRopas")
    public String deleteRopas(){
        return "Ropa eliminada satisfactoriamente";
    }
    @GetMapping("/deleteRopas/{id}")
    public String deleteRopas(@PathVariable("id") String id){
        return "Ropa eliminada satisfactoriamente";
    }
    
}
