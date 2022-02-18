package com.springreview.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnyConfig {

    @Bean
    public String str(){
        return "testString";
    }
    @Bean
    public Integer number(){
        return 111;
    }
}
