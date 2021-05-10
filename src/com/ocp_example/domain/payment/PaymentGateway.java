package com.ocp_example.domain.payment;

import com.ocp_example.model.PurchaseOrder;

//PaymentGateway used as a common interface for all e-payment providers
public interface PaymentGateway {
   String generatePaymentLink(PurchaseOrder purchaseOrder);
}