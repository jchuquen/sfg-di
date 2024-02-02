package jchuquen.study.java.dependency.injection.example.controllers;

import jchuquen.study.java.dependency.injection.example.interfaces.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private IGreetingService greetingService;

    @Autowired
    public void setGreetingService(
        @Qualifier("setterInjectedGreetingService") IGreetingService greetingService
    ) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
