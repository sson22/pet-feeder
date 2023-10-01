package com.example.iot.petfeeder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/feeder")
public class Feeder {

    @GetMapping("/feed")
    public String feed() throws IOException {
        Runtime.getRuntime().exec("python /home/pi/sophie/servomotor.py");

        return "Success";
    }

}
