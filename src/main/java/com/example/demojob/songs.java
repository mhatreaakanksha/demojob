package com.example.demojob;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class songs{

    @GetMapping("/songs")
    public String getData() {return "craete your favourite playlist";}
}
