package com.InteractionLogging.InteractionLogging.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class UCMSComplainDetailsDto {

    private String openendComplains;
    private String complainNumber;
    private String openComplaintsMessage;
}
