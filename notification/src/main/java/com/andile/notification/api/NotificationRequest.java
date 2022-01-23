package com.andile.notification.api;

import java.time.LocalDateTime;

public record NotificationRequest(
        Integer notificationId,
        Integer toCustomerId,
        String toCustomerEmail,
         String sender,
         String message,
         LocalDateTime sentAt
) {
}
