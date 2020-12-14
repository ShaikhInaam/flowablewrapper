package com.InteractionLogging.InteractionLogging.service.base;

import com.InteractionLogging.InteractionLogging.dto.AccountDetailDto;
import com.InteractionLogging.InteractionLogging.dto.RetrieveCustomerDto;
import com.InteractionLogging.InteractionLogging.dto.RetrieveOrderDto;
import com.InteractionLogging.InteractionLogging.dto.UCMSComplainDetailsDto;
import com.InteractionLogging.InteractionLogging.request.PaymentAndChargesStartProcessRequest;

public interface ThirdPartyCallService {

    RetrieveCustomerDto callRetrieveCustomer(PaymentAndChargesStartProcessRequest request);
    String callQueryHLR(PaymentAndChargesStartProcessRequest request);
    UCMSComplainDetailsDto callUCMSComplainDetails(PaymentAndChargesStartProcessRequest request);
    RetrieveOrderDto callRetrieveOrders(PaymentAndChargesStartProcessRequest request);
    AccountDetailDto getAcountDetailsCall(PaymentAndChargesStartProcessRequest request);
    void manageSrCreateComplaint(PaymentAndChargesStartProcessRequest request);
}
