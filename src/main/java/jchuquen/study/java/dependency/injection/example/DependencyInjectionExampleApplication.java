package jchuquen.study.java.dependency.injection.example;

import jchuquen.study.java.dependency.injection.example.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =
			SpringApplication.run(DependencyInjectionExampleApplication.class, args);

		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) applicationContext.getBean("myController" );

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("=====Property=====");

		PropertyInjectedController propertyInjectedController =
			(PropertyInjectedController) applicationContext.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("=====Setter=====");

		SetterInjectedController setterInjectedController =
				(SetterInjectedController) applicationContext.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("=====Constructor=====");

		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}
}
