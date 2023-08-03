package com.kinsta.stripejava.backend;

import com.stripe.model.Price;
import com.stripe.model.Product;

import java.math.BigDecimal;

public class ProductDAO {

    static Product[] products;

    static {
        products = new Product[4];

        Product sampleProduct = new Product();
        Price samplePrice = new Price();

        sampleProduct.setName("Puma Shoes");
        sampleProduct.setId("shoe");
        samplePrice.setCurrency("usd");
        samplePrice.setUnitAmountDecimal(BigDecimal.valueOf(2000));
        sampleProduct.setDefaultPriceObject(samplePrice);
        products[0] = sampleProduct;

        sampleProduct = new Product();
        samplePrice = new Price();

        sampleProduct.setName("Nike Sliders");
        sampleProduct.setId("slippers");
        samplePrice.setCurrency("usd");
        samplePrice.setUnitAmountDecimal(BigDecimal.valueOf(1000));
        sampleProduct.setDefaultPriceObject(samplePrice);
        products[1] = sampleProduct;

        sampleProduct = new Product();
        samplePrice = new Price();

        sampleProduct.setName("Apple Music+");
        sampleProduct.setId("music");
        samplePrice.setCurrency("usd");
        samplePrice.setUnitAmountDecimal(BigDecimal.valueOf(499));
        sampleProduct.setDefaultPriceObject(samplePrice);
        products[2] = sampleProduct;

    }

    public static Product getProduct(String id) {

        if ("shoe".equals(id)) {
            return products[0];
        } else if ("slippers".equals(id)) {
            return products[1];
        } else if ("music".equals(id)) {
            return products[2];
        } else return new Product();

    }
}
