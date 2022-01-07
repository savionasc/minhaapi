package com.api.savio.minhaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    @GetMapping
    public String getWelcome(){
        return "Welcome to my API!<br />Eu estou feliz apesar de tudo isso!";
    }
}
