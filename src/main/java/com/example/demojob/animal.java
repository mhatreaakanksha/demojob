package com.example.demojob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class animal{

    @GetMapping("/animal")
    public String getData() {return "Tiger ,Lion ,Deer ,Elephant ";}
}