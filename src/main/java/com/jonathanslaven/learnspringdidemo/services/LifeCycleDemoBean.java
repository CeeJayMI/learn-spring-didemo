package com.jonathanslaven.learnspringdidemo.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println(">> I'm in the LifeCycleBean constructor");
    }

    @Override
    public void destroy()  {
        System.out.println(">> Bean is being destroyed");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println(">> Bean properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(">> Bean factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(">> My bean name is: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(">> Bean application context set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(">> Bean post construct annotated method called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(">> Bean pre destroy annotated method called");
    }

    public void beforeInit() {
        System.out.println(">> * Before Init called by custom bean post processor");
    }

    public void afterInit() {
        System.out.println(">> * After Init called by custom bean post processor");
    }
}
