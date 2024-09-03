package com.northcoders.SecurityPlayground.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;


@RestController
@RequestMapping("/api/v1")
public class Greeting {

    @GetMapping("/open/greeting")
    public ResponseEntity<String> formalGreeting() {
        return new ResponseEntity<>("Welcome.", HttpStatus.OK);
    }

    @GetMapping("/protected/greeting")
    public ResponseEntity<String> friendlyGreeting(@AuthenticationPrincipal OAuth2User principal) {
        String name = principal.getAttribute("name");
        String username = principal.getAttribute("login");
        return new ResponseEntity<>("Hey, " + name + "! " + "Welcome @" + username, HttpStatus.OK);
    }
}

