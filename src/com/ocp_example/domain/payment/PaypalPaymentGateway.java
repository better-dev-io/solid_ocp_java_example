package com.ocp_example.domain.payment;

import com.ocp_example.model.PurchaseOrder;

public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public String generatePaymentLink(PurchaseOrder purchaseOrder) {
        return "https://generated-by-paypal.com/".concat("random-generated-link");
    }
}