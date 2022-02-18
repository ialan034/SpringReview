package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {
    public static void main(String[] args) {
        
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        
        Car car = context.getBean(Car.class);
        System.out.println("car.getMake() = " + car.getMake());
        
        Person person = context.getBean(Person.class);
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getCar().getMake() = " + person.getCar().getMake());
    }
}
