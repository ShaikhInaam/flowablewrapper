package com.InteractionLogging.InteractionLogging.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayAndCharStartProcessRuntimeProcessInstancesJsonRequest {

    private String processDefinitionId;

    private Variables[] variables;

    private Boolean returnVariables;


    @Setter
    @Getter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Variables
    {
        //private String id;

        private String name;

        private String value;




    }
}
