package com.andile.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class CustomerApplication {
    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(CustomerApplication.class, args);
        String[] beansNames = context.getBeanDefinitionNames();

//        Arrays.sort(beansNames);
//        for (String beanName: beansNames){
//            System.out.println(beanName);
//        }
    }
}
