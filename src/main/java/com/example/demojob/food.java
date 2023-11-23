package com.example.demojob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class food{

    @GetMapping("/food")
    public String getData() {return "i love maharashtrian food";}
}
