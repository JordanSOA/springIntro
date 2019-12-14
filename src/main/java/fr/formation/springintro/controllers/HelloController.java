package fr.formation.springintro.controllers;


import fr.formation.springintro.pojos.HelloWorld;
import fr.formation.springintro.pojos.Member;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/customHeader")
    ResponseEntity<String> customHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Test", "Test Sympa");
        return new ResponseEntity<>("Custom header set", headers, HttpStatus.OK);
    }

    @PostMapping(path = "/subscribe")
    ResponseEntity<String> Member(@RequestParam(value="id")int id,@RequestParam(value = "name") String name){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Id", String.valueOf(id));
        headers.add("MemberName", name);
        return new ResponseEntity<>("Nouveau Membre !", headers, HttpStatus.CREATED);
    }

}
