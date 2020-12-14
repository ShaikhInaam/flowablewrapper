package com.InteractionLogging.InteractionLogging.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RetrieveCustomerDto {


    private String accountProduct;
    private String accountStatus;
    private String consumerValueSegment;
    private String nationality;
    private String isRatePlanAvailableStill;
    private String creditStatus;
    private String creditReason;
    private String notesTypeCode;
    private String registrationStatus;
    private String effectiveTill;
    private String  registrationMessage;



}
