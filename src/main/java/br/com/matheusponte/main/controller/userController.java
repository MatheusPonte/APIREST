package br.com.matheusponte.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // A classe controladora definindo, onde vai receber requisção// -> construindo uma app no conceito API REST
@RequestMapping("/login") // Rota
public class userController {

    @GetMapping("/users")
    public String primeiroMetodo(){
        return "Meu primeiro metodo api rest";
    }
}
