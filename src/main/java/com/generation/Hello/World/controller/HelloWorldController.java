package com.generation.Hello.World.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloworld(){
        return "Hello World";
    }

    @GetMapping("/bsm")
    public String bsm(){
        return """
                # Mentalidades:
                
                - Orientação ao futuro
                - Persistência
                - Responsabilidade Pessoal
                - Mentabilidade de Crescimento
                
                # Competências comportamentais:
                
                - Comunicação
                - Proatividade
                - Orientação ao Detalhe
                - Trabalho em equipe
                """;
    }

    @GetMapping("/objetivos")
    public String objetivos(){
        return "Desenvolver meu lado pessoal e profissional entendendo as mentalidades e as outras soft skills que tenho tanto problema, e além disso mas não menos importante melhorar meu nível técnico.";
    }

}
