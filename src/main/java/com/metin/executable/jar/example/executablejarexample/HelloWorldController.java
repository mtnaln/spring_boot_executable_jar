package com.metin.executable.jar.example.executablejarexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Metin on 4.05.2019.
 */

@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Hello World...";
    }
}
