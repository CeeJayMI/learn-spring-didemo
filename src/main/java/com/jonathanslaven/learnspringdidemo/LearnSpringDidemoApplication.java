package com.jonathanslaven.learnspringdidemo;

import com.jonathanslaven.learnspringdidemo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringDidemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LearnSpringDidemoApplication.class, args);

        I18nController i18nController = ctx.getBean(I18nController.class);
        System.out.println(i18nController.sayHello());


        MyController myController = ctx.getBean(MyController.class);

        System.out.println("PRIMARY BEAN =================");
        System.out.println(myController.sayHello());

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
