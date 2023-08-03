package com.kinsta.stripejava.backend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.model.Product;

public class RequestDTO {
    Product[] items;
    String customerName;
    String customerEmail;
    String subscriptionId;

    @JsonProperty
    boolean invoiceNeeded;

    public Product[] getItems() {
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public boolean isInvoiceNeeded() {
        return invoiceNeeded;
    }

}