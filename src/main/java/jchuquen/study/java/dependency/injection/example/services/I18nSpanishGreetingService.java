package jchuquen.study.java.dependency.injection.example.services;

import jchuquen.study.java.dependency.injection.example.interfaces.IGreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
