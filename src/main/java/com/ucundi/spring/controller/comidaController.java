package com.ucundi.spring.controller;

import com.ucundi.spring.domain.comidaEntity;
import com.ucundi.spring.repositories.comidaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author AndresMiranda
 */
@RestController
@RequestMapping("/api")
public class comidaController {
    private final comidaRepositories comidaR;
    @Autowired
    public comidaController(comidaRepositories comidaR) {
        this.comidaR = comidaR;
    }

    @PostMapping("/createComidas")
    public ResponseEntity<comidaEntity> agregarcomida(@RequestBody comidaEntity comidaAdd) {
        comidaEntity comidaAgregada = comidaR.save(comidaAdd);
        return new ResponseEntity<>(comidaAgregada, HttpStatus.CREATED);
    }

    @GetMapping("/readComidas")
    public String readComidas(){
        return String.valueOf(comidaR.findAll());
    }

    @GetMapping("/readComidas/{id}")
    public Optional<comidaEntity> readComidas(@PathVariable("id") String identificador){
        String regexforID = "[1-5 a-z]{1,5}";
        if (identificador == null || !identificador.matches(regexforID))
            throw new IllegalArgumentException();
        return comidaR.findById(Long.valueOf(identificador));
    }

    @PutMapping("/updateComidas")
    public ResponseEntity<comidaEntity> updatecomida(@RequestBody comidaEntity comidaUpd) {
        comidaEntity comidaActualizada = comidaR.save(comidaUpd);
        return new ResponseEntity<>(comidaActualizada, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteComidas/{id}")
    public void eliminarUsuarioPorId(@PathVariable Long id) {
        comidaR.deleteById(id);
    }

}
