package com.ucundi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ropa {

    @GetMapping("/ropa")
    public String showIndex(Model model) {
        model.addAttribute("title", "Ropa");
        return "index"; // Esto devuelve "index.html" en la carpeta templates
    }
}