package com.example.eurekaservicesupport.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/HEL")
public class SupportController {


    @GetMapping( "/WOR")

    public Object hello() {
        return "Hello Mango!";
    }
}
