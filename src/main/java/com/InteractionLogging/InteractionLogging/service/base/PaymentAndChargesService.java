package com.InteractionLogging.InteractionLogging.service.base;

import com.InteractionLogging.InteractionLogging.request.PaymentAndChargeNavigateProcessRequest;
import com.InteractionLogging.InteractionLogging.request.PaymentAndChargesStartProcessRequest;
import com.InteractionLogging.InteractionLogging.response.PaymentAndChargeNavigateProcessResponse;
import com.InteractionLogging.InteractionLogging.response.PaymentAndChargesStartProcessResponse;

public interface PaymentAndChargesService {

    PaymentAndChargesStartProcessResponse startProcess(PaymentAndChargesStartProcessRequest request);
    PaymentAndChargeNavigateProcessResponse navigateProcess (PaymentAndChargeNavigateProcessRequest request);

}
