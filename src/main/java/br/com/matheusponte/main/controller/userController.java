package br.com.matheusponte.main.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // A classe controladora definindo, onde vai receber requisção// -> construindo uma app no conceito API REST
@RequestMapping("/login") // Rota
public class userController {

    @GetMapping("/users/{id}")
    public String primeiroMetodo(@PathVariable String id){ // metodo junto com parametro
        return "o parametro é " + id;
    }
    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id){
        return "O parametro com query é " + id;

    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams){
        return "O parametro com query é " + allParams.entrySet();

    }

   @PostMapping("/metodoBody")
    public String metodoComBodyParams(@RequestBody Usuario usuario){
        return "metodoComBody " + usuario.username();
    }

        @PostMapping("/metodoHeader")
    public String metodoComHeader(@RequestHeader("name") String name){
        return "metodoHeader " + name;
    }

    @PostMapping("/metodoComListHeader")
    public String metodoComHeader(@RequestHeader Map<String, String> headers){
        return "metodoHeader " + headers.entrySet();
    }

    record Usuario(String username){

    }
}
