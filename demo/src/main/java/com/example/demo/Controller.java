package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class Controller {

    @GetMapping
    public ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.ok("Hello World");
    }

}
