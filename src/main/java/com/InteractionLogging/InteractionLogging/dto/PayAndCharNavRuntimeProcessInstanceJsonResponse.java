package com.InteractionLogging.InteractionLogging.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PayAndCharNavRuntimeProcessInstanceJsonResponse {

    private String scope;

    private String name;

    private String type;

    private String value;

}
