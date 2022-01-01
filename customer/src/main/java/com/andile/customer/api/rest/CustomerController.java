package com.andile.customer.api.rest;


import com.andile.customer.api.dto.CustomerRequest;
import com.andile.customer.api.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * CustomerController
 **/
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    /**
     * End point used to register new customer
     * @param customerRequest represents customers request to register
     */
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRequest customerRequest){
        log.info("New Customer registration {}" , customerRequest);
        customerService.registerCustomer(customerRequest);
    }

}
