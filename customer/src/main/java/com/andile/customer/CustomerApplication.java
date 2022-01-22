package com.andile.customer;

import com.andile.customer.model.Customer;
import com.andile.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication {


    public static void main(String[] args) {

        SpringApplication.run(CustomerApplication.class, args);


    }
//    @Autowired
//    private  CustomerRepository repository;
//    @EventListener(ApplicationEvent.class)
//    public void runAfterStartUp() {
//        List allCustomer = this.repository.findAll();
//        System.out.println("NUmber of customers" + allCustomer.size());
//
//
//        Customer customer = new Customer();
//        customer.setFirstName("Andile");
//        customer.setLastName("Gumada");
//        customer.setEmail("andile.gumada@xgile.com");
//        System.out.println("Saving to the db");
//        this.repository.save(customer);
//
//        allCustomer = this.repository.findAll();
//        System.out.println("NUmber of customers" + allCustomer.size());
//
//    }
}
