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
public class juguetesController {
    
    @GetMapping("/createJuguetes")
    public String createJuguetes(){
        return "Juguete creado satisfactoriamente";
    }
    @GetMapping("/createJuguetes/{id}")
    public String createJuguetes(@PathVariable("id") String id){
        return "Juguete creado satisfactoriamente";
    }
    @GetMapping("/readJuguetes")
    public String readJuguetes(){
        return "Juguete consultado satisfactoriamente";
    }
    @GetMapping("/readJuguetes/{id}")
    public String readJuguetes(@PathVariable("id") String id){
        return "Juguete consultado satisfactoriamente";
    }
    @GetMapping("/updateJuguetes")
    public String updateJuguetes(){
        return "Juguete actualizado satisfactoriamente";
    }
    @GetMapping("/updateJuguetes/{id}")
    public String updateJuguetes(@PathVariable("id") String id){
        return "Juguete actualizado satisfactoriamente";
    }
    @GetMapping("/deleteJuguetes")
    public String deleteJuguetes(){
        return "Juguete eliminado satisfactoriamente";
    }
    @GetMapping("/deleteJuguetes/{id}")
    public String deleteJuguetes(@PathVariable("id") String id){
        return "Juguete eliminado satisfactoriamente";
    }
    
}
