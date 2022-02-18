package com.springreview.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    FullTimeStudent getFullTimeStudent(){
        return new FullTimeStudent();
    }

    // name is optional to distinguish same class objects
//    @Bean(name = "p1")
    @Bean
    @Primary // for same class objects it has priority
    PartTimeStudent getPartTimeStudent1(){
        return new PartTimeStudent();
    }

    @Bean(name = "p2")
//    @Bean
    PartTimeStudent getPartTimeStudent2(){
        return new PartTimeStudent();
    }
}
