package com.example.demojob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class sport{

    @GetMapping("/sport")
    public String getData() {return "I like to play cricket";}
}
