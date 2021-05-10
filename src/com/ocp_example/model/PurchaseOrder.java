package com.ocp_example.model;

/**
 * PurchaseOrder used to store the order information
 */
public class PurchaseOrder {
    String productName;
    int quantity;
    int price;
    int userId;
    int paymentType;

    // constructor used to pass the values
    public PurchaseOrder(String productName, int quantity, int price, int userId, int paymentType) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.userId = userId;
        this.paymentType = paymentType;
    }

    public int paymentType() {
        return this.paymentType;
    }
}

