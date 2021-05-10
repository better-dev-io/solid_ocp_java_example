package com.ocp_example.domain.payment;

import java.util.HashMap;
import java.util.Map;

/***
 * EPaymentGatewayProvider provides a single source of truth for all payment providers
 */
public class EPaymentGatewayProvider {

    // a list to store all e-payment providers
    Map<Integer, PaymentGateway> ePaymentGatewaysList = new HashMap<Integer, PaymentGateway>() {{
        put(1, new PaypalPaymentGateway());
        put(2, new StripePaymentGateway());
    }};

    // used internally to store the instance of the class
    private static EPaymentGatewayProvider paymentProviderInstance = null;

    // used globally to provide a singleton instance of the class
    public static EPaymentGatewayProvider getInstance() {
        if (paymentProviderInstance == null)
            paymentProviderInstance = new EPaymentGatewayProvider();

        return paymentProviderInstance;
    }

    // provides PaymentGateway given the ID of the e-payment
    // throws an Exception if payment provider dose not exist
    public PaymentGateway ePaymentGatewayByID(int paymentTypeID) throws Exception {

        boolean ePaymentTypeExist = ePaymentGatewaysList.containsKey(paymentTypeID);

        if (ePaymentTypeExist) {
            return ePaymentGatewaysList.get(paymentTypeID);
        }

        throw new Exception("Payment Method Dose Not Exist");
    }
}