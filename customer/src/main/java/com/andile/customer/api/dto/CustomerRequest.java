package com.andile.customer.api.dto;

public record CustomerRequest(
         String firstName,
         String lastName,
         String email
) {
}
