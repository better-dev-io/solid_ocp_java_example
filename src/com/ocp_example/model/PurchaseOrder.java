package com.ocp_example.model;

public class PurchaseOrder {
    String productName;
    int quantity;
    int price;
    int userId;
    int paymentType;

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

