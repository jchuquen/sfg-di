package jchuquen.study.java.dependency.injection.example.services;

import jchuquen.study.java.dependency.injection.example.interfaces.IGreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}
