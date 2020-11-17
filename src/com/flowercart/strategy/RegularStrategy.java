package com.flowercart.strategy;

import com.flowercart.entity.Product;

import java.util.List;

public class RegularStrategy implements PricingStrategy {
    @Override
    public float calculateTotal(List<Product> items) {
        float totalCost = 0;
        for (Product item : items) {
            float costOfProduct = item.getPrice();
            totalCost = totalCost + costOfProduct;
        }
        return totalCost;

    }
}
