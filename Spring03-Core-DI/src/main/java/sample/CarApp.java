package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {
    public static void main(String[] args) {
        
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        
        Car car = context.getBean(Car.class);
        System.out.println("Default car make = " + car.getMake());
        
        Person person = context.getBean(Person.class);
        System.out.println("Person's name = " + person.getName());
        System.out.println("Person's car = " + person.getCar().getMake());
    }
}
