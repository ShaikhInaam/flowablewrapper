package com.InteractionLogging.InteractionLogging.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentAndChargesStartProcessRequest {

    private SelectedData[] selectedData;

    private String chargeType;

    private String chargeSubType1;

    private String chargeSubType2;

    private String chargeBenifitType;

    private String accountProduct;
    private String consumerValueSegment;
    private String nationality;
    private String customerFrequency;
    private String msisdn;
    private String refundCategory;
    private String chargeDate;
    private String ratePlan;
    private String ratePlanType;

    private Integer chargeAmount;
    private String channel;
    private String transactionId;
    private String hlrRequestedSystem;
    private String ucmsRequestedSystem;
    private String accountDetailsRequestedSystem;
    private String lang;




    @Setter
    @Getter
    public static class SelectedData
    {
        private String name;

        private String value;




    }

}
