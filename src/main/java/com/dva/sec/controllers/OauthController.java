package com.dva.sec.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/oauth2")
public class OauthController {

    @GetMapping
    private ResponseEntity<String> oauth2Test() {
        return ResponseEntity.ok("this is a test");
    }
}
