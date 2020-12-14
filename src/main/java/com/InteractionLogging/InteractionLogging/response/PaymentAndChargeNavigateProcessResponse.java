package com.InteractionLogging.InteractionLogging.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentAndChargeNavigateProcessResponse implements Serializable {

    private String[] formActions;

    private String formCode;

    private String taskId;

    private String faqType;

    private String faqKey;

    private String complaintNatureCode;

    private String complaintTypeCode;

    private String skillNo;

    private String CBAType;

}
