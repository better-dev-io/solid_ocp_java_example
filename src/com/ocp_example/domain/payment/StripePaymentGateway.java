package com.ocp_example.domain.payment;

import com.ocp_example.model.PurchaseOrder;

//StripePaymentGateway mimics stripe e-payment provider
public class StripePaymentGateway implements PaymentGateway {

    @Override
    public String generatePaymentLink(PurchaseOrder purchaseOrder) {
        return "https://generated-by-stripe.com/".concat("random-generated-link");
    }
}
