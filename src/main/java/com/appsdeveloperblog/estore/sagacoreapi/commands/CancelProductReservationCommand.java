package com.appsdeveloperblog.estore.sagacoreapi.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class CancelProductReservationCommand {

    @TargetAggregateIdentifier
    private final String productId;
    private final  String orderId;
    private final Integer quantity;
    private final String userId;
    private final String reason;
}
