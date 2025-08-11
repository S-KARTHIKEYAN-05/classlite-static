package com.example.classlite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // tells Spring this class is a REST controller
public class HelloController {

    @GetMapping("/hello") // maps browser GET request to /hello
    public String sayHello() {
        return "Hello ClassLite!";
    }
}
