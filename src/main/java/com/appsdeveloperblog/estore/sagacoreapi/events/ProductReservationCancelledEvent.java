package com.appsdeveloperblog.estore.sagacoreapi.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductReservationCancelledEvent {

    private final String productId;
    private final  String orderId;
    private final Integer quantity;
    private final String userId;
    private final String reason;
}

