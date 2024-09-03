package com.northcoders.SecurityPlayground.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Greeting {

    @GetMapping("/open/greeting")
    public ResponseEntity<String> formalGreeting() {
        return new ResponseEntity<>("Welcome.", HttpStatus.OK);
    }

    @GetMapping("/protected/greeting")
    public ResponseEntity<String> friendlyGreeting() {
        return new ResponseEntity<>("Hey!", HttpStatus.OK);
    }

}

