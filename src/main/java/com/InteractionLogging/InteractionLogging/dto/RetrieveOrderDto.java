package com.InteractionLogging.InteractionLogging.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class RetrieveOrderDto {


    private String openOrders;
    private String orderNumber;
    private String openOrdersMessage;
}
