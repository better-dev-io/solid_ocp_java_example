package com.ocp_example;

import com.ocp_example.domain.payment.PaymentGateway;
import com.ocp_example.model.PurchaseOrder;
import com.ocp_example.domain.payment.EPaymentGatewayProvider;

public class Main {

    public static void main(String[] args) {

        PurchaseOrder purchaseOrder = new PurchaseOrder(
                "Orange 1kg",
                1,
                12,
                100,
                2);

        try {
            PaymentGateway paymentGateway = EPaymentGatewayProvider
                    .getInstance()
                    .ePaymentGatewayByID(purchaseOrder.paymentType());

            String generatedLink = paymentGateway.generatePaymentLink(purchaseOrder);

            System.out.println("The Generated Link Is");
            System.out.println(generatedLink);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}


