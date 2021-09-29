package com.ttomadakis.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ttomadakis.spring5jokesappv2.services.JokesService;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/joke")
    public String getRandomQuote (Model model){
        model.addAttribute("joke",jokesService.getRandomQuote());
        return "jokes/index";
    }
}
