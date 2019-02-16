package br.com.codenation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExemploController {

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Primeiro exemplo Spring Boot";
    }

    @GetMapping("/outro")
    @ResponseBody
    public String outro(){
        return "<b>Outro</b> exemplo Spring";
    }
}
