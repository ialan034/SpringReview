package com.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Car car(){
        Car car = new Car();
        car.setMake("Honda");
        return car;
    }

    // Direct wiring
//    @Bean
//    Person person(){
//        Person person = new Person();
//        person.setName("John");
//        person.setCar(car()); // direct wiring
//        return person;
//    }

    // Autowiring
    @Bean
    Person person(Car car){
        Person person = new Person();
        person.setName("John");
        person.setCar(car); // direct wiring
        return person;
    }
}
