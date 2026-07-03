package com.myproject.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String sayHello(){
        return "Hello Fellas" ;
    }
    @GetMapping("/sum")
    public int sum(@RequestParam int n,@RequestParam int m){
        return m+n;
    }
    @GetMapping("/smthing")
    public String xyz(){
        return "Blah Blah Blah";
    }
}



