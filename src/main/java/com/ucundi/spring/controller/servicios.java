package com.ucundi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class servicios {

    @GetMapping("/servicios")
    public String showIndex(Model model) {
        model.addAttribute("title", "Servicios");
        return "index"; // Esto devuelve "index.html" en la carpeta templates
    }
}