package com.andile.customer.api.service;


import com.andile.customer.api.dto.CustomerRequest;
import com.andile.customer.api.dto.FraudCheckResponse;
import com.andile.customer.model.Customer;
import com.andile.customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;
    private final RestTemplate restTemplate;

    public void registerCustomer(CustomerRequest customerRequest) throws FraudsterException {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();
        // todo: check if email is valid
        // todo: check if email not taken
        // todo: store customer in db
        repository.saveAndFlush(customer);
        // todo: check if fraudster
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://FRAUD/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );
        if (fraudCheckResponse.isFraudster()){
            throw new FraudsterException("Customer is a fraudster");
        }

    }
}
