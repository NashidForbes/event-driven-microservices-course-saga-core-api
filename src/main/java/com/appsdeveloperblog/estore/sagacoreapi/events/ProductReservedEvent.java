package com.appsdeveloperblog.estore.sagacoreapi.events;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductReservedEvent {

    private String productId;
    private String orderId;
    private Integer quantity;
    private String userId;
}
