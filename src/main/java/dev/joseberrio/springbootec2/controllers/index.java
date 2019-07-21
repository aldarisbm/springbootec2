package dev.joseberrio.springbootec2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class index {

    @GetMapping
    public BasicMessage helloWorld(@RequestParam("message") String message){
        return new BasicMessage(message);
    }
}


class BasicMessage {
    String message;

    BasicMessage(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}