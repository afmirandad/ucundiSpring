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
public class comidaController {
    
    @GetMapping("/createComidas")
    public String createComidas(){
        return "Comida creada satisfactoriamente";
    }
    @GetMapping("/createComidas/{id}")
    public String createComidas(@PathVariable("id") String id){
        return "Comida creada satisfactoriamente";
    }
    @GetMapping("/readComidas")
    public String readComidas(){
        return "Comida consultada satisfactoriamente";
    }
    @GetMapping("/readComidas/{id}")
    public String readComidas(@PathVariable("id") String id){
        return "Comida creada satisfactoriamente";
    }
    @GetMapping("/updateComidas")
    public String updateComidas(){
        return "Comida actualizada satisfactoriamente";
    }
    @GetMapping("/updateComidas/{id}")
    public String updateComidas(@PathVariable("id") String id){
        return "Comida actualizada satisfactoriamente";
    }
    @GetMapping("/deleteComidas")
    public String deleteComidas(){
        return "Comida eliminada satisfactoriamente";
    }
    @GetMapping("/deleteComidas/{id}")
    public String deleteComidas(@PathVariable("id") String id){
        return "Comida eliminada satisfactoriamente";
    }
    
}
