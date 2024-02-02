package jchuquen.study.java.dependency.injection.example.services;

import jchuquen.study.java.dependency.injection.example.interfaces.IGreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World From Property";
    }
}
