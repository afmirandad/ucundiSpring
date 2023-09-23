package com.ucundi.spring.controller;

import com.ucundi.spring.domain.camasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ucundi.spring.repositories.camasRepositories;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class camasController {
    private final camasRepositories camasR;
    @Autowired
    public camasController(camasRepositories camasR) {
        this.camasR = camasR;
    }

    @PostMapping("/createCamas")
    public ResponseEntity<camasEntity> agregarCama(@RequestBody camasEntity camaAdd) {
        camasEntity camaAgregada = camasR.save(camaAdd);
        return new ResponseEntity<>(camaAgregada, HttpStatus.CREATED);
    }

    @GetMapping("/readCamas")
    public String readCamas(){
        return String.valueOf(camasR.findAll());
    }

    @GetMapping("/readCamas/{id}")
    public Optional<camasEntity> readCamas(@PathVariable("id") String identificador){
        String regexforID = "[1-5 a-z]{1,5}";
        if (identificador == null || !identificador.matches(regexforID))
            throw new IllegalArgumentException();
        return camasR.findById(Long.valueOf(identificador));
    }

    @PutMapping("/updateCamas")
    public ResponseEntity<camasEntity> updateCama(@RequestBody camasEntity camaUpd) {
        camasEntity camaActualizada = camasR.save(camaUpd);
        return new ResponseEntity<>(camaActualizada, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCamas/{id}")
    public void eliminarUsuarioPorId(@PathVariable Long id) {
        camasR.deleteById(id);
    }

}
