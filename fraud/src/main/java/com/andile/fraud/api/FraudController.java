package com.andile.fraud.api;

import com.andile.fraud.dto.FraudCheckResponse;
import com.andile.fraud.service.FraudCheckService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    private final FraudCheckService fraudCheckService;

    /**
     * @param customerID
     * @return
     */
    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId")Integer customerID){
        boolean isFraudulentCustomer = fraudCheckService.isFraudulent(customerID);
        log.info("fraud check request for customer {}",customerID);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
