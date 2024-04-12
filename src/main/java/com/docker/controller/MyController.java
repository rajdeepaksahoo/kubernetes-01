package com.docker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("Home Page", HttpStatus.OK);
    }
    @GetMapping("/bye")
    public ResponseEntity<String> bye(){
        return new ResponseEntity<>("Bye Bye",HttpStatus.OK);
    }
}
