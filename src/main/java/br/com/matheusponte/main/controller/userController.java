package br.com.matheusponte.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

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

    @GetMapping("/response/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){
        var usuario = new Usuario("Ponte");
        if( id > 5){
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("menor que 5");
    }

    record Usuario(String username){

    }
}
