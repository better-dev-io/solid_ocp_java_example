package com.ocp_example;

import com.ocp_example.domain.payment.PaymentGateway;
import com.ocp_example.model.PurchaseOrder;
import com.ocp_example.domain.payment.EPaymentGatewayProvider;

public class Main {

    public static void main(String[] args) {

        /*  Creating a new purchase order
         *  this mimics a request coming from a mobile application
         */
        PurchaseOrder purchaseOrder = new PurchaseOrder(
                "Orange 1kg",
                1,
                12,
                100,
                1);

        /*
         * the EPaymentGatewayProvider might through an Exception
         * we need to handle it through try and catch
         */
        try {
            /*
             * Getting the required e-payment provider
             * through EPaymentGatewayProvider instance
             */
            PaymentGateway paymentGateway = EPaymentGatewayProvider
                    .getInstance()
                    .ePaymentGatewayByID(purchaseOrder.paymentType());

            /*
             * Generating the payment link for any payment provider
             */
            String generatedLink = paymentGateway.generatePaymentLink(purchaseOrder);

            System.out.println("The Generated Link Is");
            System.out.println(generatedLink);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}


