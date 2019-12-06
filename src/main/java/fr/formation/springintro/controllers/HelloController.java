package fr.formation.springintro.controllers;


import fr.formation.springintro.pojos.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hellowitname")
    public String helloWorld(@RequestParam(value = "userName", required = false) String userName){

        if (userName == null || userName.length() == 0) {
            return "Hello World human !";
        } else
            return "Hello World  to you " + userName;
    }

    @GetMapping("/hello")
    public HelloWorld helloWorld(){
        return new HelloWorld("Hello World !");
    }

}
