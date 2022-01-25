package com.tintachina.experimental.compliment.adapter.in.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComplimentController {
    
    @GetMapping(value = "healthcheck")
    public ResponseEntity<String> healthcheck() {
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }
}
