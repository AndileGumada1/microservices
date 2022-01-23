package com.andile.customer.api.service;

public record NotificationRequest(Integer customerId,
                                  String email,
                                  String message

                                  ) {
}
