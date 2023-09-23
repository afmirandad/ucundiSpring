package com.ucundi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ucundi.spring.repositories.comidaRepositories;

@Controller
public class comida {

    private final comidaRepositories comidaR;

    public comida(comidaRepositories comidaR) {
        this.comidaR = comidaR;
    }

    @GetMapping("/comida")
    public String showIndex(Model model) {
        model.addAttribute("title", comidaR.count());
        return "index";
    }
}