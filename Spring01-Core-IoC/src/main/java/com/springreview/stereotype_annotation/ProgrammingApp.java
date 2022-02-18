package com.springreview.stereotype_annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgrammingApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean(Java.class).getTeachingHours();
        context.getBean(CSharp.class).getTeachingHours();
        context.getBean(JavaScript.class).getTeachingHours();
    }

}
