package com.jonathanslaven.learnspringdidemo.controllers;

import com.jonathanslaven.learnspringdidemo.services.GreetingService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
