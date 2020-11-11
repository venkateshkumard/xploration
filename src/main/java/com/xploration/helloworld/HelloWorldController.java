package com.xploration.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helloworld")
public class HelloWorldController{


    @GetMapping(path="/{name}")
    public String getMessage(@PathVariable("name") String name){
        return "Hello World... Welcome "+ name + " to Xploration Day ";
    }
}
