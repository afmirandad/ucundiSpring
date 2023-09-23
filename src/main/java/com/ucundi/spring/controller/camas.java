package com.ucundi.spring.controller;

import com.ucundi.spring.repositories.camasRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class camas {

    private final camasRepositories camasR;

    public camas(camasRepositories camasR) {
        this.camasR = camasR;
    }

    @GetMapping("/camas")
    public String showIndex(Model model) {
        model.addAttribute("title", "Cantidad camas: "+ camasR.count());
        return "index";
    }
}
