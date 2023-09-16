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
public class serviciosController {
    
    @GetMapping("/createServicios")
    public String createServicios(){
        return "Servicio creado satisfactoriamente";
    }
    @GetMapping("/createServicios/{id}")
    public String createServicios(@PathVariable("id") String id){
        return "Servicio creado satisfactoriamente";
    }
    @GetMapping("/readServicios")
    public String readServicios(){
        return "Servicio consultado satisfactoriamente";
    }
    @GetMapping("/readServicios/{id}")
    public String readServicios(@PathVariable("id") String id){
        return "Servicio consultado satisfactoriamente";
    }
    @GetMapping("/updateServicios")
    public String updateServicios(){
        return "Servicio actualizado satisfactoriamente";
    }
    @GetMapping("/updateServicios/{id}")
    public String updateServicios(@PathVariable("id") String id){
        return "Servicio actualizado satisfactoriamente";
    }
    @GetMapping("/deleteServicios")
    public String deleteServicios(){
        return "Servicio eliminado satisfactoriamente";
    }
    @GetMapping("/deleteServicios/{id}")
    public String deleteServicios(@PathVariable("id") String id){
        return "Servicio eliminado satisfactoriamente";
    }
    
}
