package com.InteractionLogging.InteractionLogging.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class AccountDetailDto {

    private String isMinimumBalanceAvailable;
    private String prepaidBalance;
    private String minimumBalanceMessage;

}
