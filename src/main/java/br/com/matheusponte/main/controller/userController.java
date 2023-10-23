package br.com.matheusponte.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // A classe controladora definindo, onde vai receber requisção// -> construindo uma app no conceito API REST
@RequestMapping("/login") // Rota
public class userController {

    @GetMapping("/users/{id}")
    public String primeiroMetodo(@PathVariable String id){ // metodo junto com parametro
        return "o parametro é " + id;
    }
}
