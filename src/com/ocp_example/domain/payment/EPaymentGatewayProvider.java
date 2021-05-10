package com.ocp_example.domain.payment;

import java.util.HashMap;
import java.util.Map;

public class EPaymentGatewayProvider {

    Map<Integer, PaymentGateway> ePaymentGatewaysList = new HashMap<Integer, PaymentGateway>() {{
        put(1, new PaypalPaymentGateway());
        put(2, new StripePaymentGateway());
    }};

    private static EPaymentGatewayProvider paymentProviderInstance = null;

    public static EPaymentGatewayProvider getInstance() {
        if (paymentProviderInstance == null)
            paymentProviderInstance = new EPaymentGatewayProvider();

        return paymentProviderInstance;
    }


    public PaymentGateway ePaymentGatewayByID(int paymentTypeID) throws Exception {

        boolean ePaymentTypeExist = ePaymentGatewaysList.containsKey(paymentTypeID);

        if (ePaymentTypeExist) {
            return ePaymentGatewaysList.get(paymentTypeID);
        }

        throw new Exception("Payment Method Dose Not Exist");
    }
}