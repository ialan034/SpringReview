package com.springreview.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentManagementApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class,AnyConfig.class);

        FullTimeStudent fullTimeStudent = container.getBean(FullTimeStudent.class);
        fullTimeStudent.createAccount();

//        System.out.println("Part Time Student 1: ");
//        PartTimeStudent partTimeStudent = container.getBean("p1",PartTimeStudent.class);
//        partTimeStudent.createAccount();
//
        System.out.println("Part Time Student 2: ");
        container.getBean("p2",PartTimeStudent.class).createAccount();

        System.out.println("Primary annotation usage");
        container.getBean(PartTimeStudent.class).createAccount();




    }
}
