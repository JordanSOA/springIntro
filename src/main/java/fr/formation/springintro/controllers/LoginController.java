package fr.formation.springintro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @GetMapping("/welcome")
    public ModelAndView firstPage(){
        return new ModelAndView("welcome");
    }
}
