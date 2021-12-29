package com.appsdeveloperblog.estore.sagacoreapi.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class ReserveProductCommand {

    @TargetAggregateIdentifier
    private String productId;
    private String orderId;
    private Integer quantity;
    private String userId;
}
