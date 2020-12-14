package com.InteractionLogging.InteractionLogging.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentAndChargeNavigateProcessRequest {

    private SelectedData[] selectedData;
    private String processInstanceId;

    private String taskId;

    private String scenario;




    @Setter
    @Getter
    public static class SelectedData {
        private String name;

        private String value;
    }

}
