package com.InteractionLogging.InteractionLogging.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayAndCharNavProcessRunTaskJsonRequest {

    private Variables[] variables;

    private String action;


    @Setter
    @Getter
    public static class Variables {
        private String name;


        private String value;

    }

}
