package com.andile.customer.api.service;


import com.andile.customer.api.dto.CustomerRequest;
import com.andile.customer.model.Customer;
import com.andile.customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;
    public void registerCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();
        // todo: check if email is valid
        // todo: check if email not taken
        // todo: store customer in db
        repository.save(customer);
    }
}
