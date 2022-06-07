package com.jonathanslaven.learnspringdidemo;

import com.jonathanslaven.learnspringdidemo.controllers.ConstructorInjectedController;
import com.jonathanslaven.learnspringdidemo.controllers.MyController;
import com.jonathanslaven.learnspringdidemo.controllers.PropertyInjectedController;
import com.jonathanslaven.learnspringdidemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringDidemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LearnSpringDidemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("PROPERTY =================");
        PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("SETTER =================");
        SetterInjectedController setterInjectedController = ctx.getBean((SetterInjectedController.class));
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("CONSTRUCTOR =================");
        ConstructorInjectedController constructorInjectedController = ctx.getBean((ConstructorInjectedController.class));
        System.out.println(constructorInjectedController.getGreeting());
    }

}
