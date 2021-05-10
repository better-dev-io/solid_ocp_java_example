package com.ocp_example.domain.payment;

import com.ocp_example.model.PurchaseOrder;

public interface PaymentGateway {
   String generatePaymentLink(PurchaseOrder purchaseOrder);
}