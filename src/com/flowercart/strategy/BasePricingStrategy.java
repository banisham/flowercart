package com.flowercart.strategy;

import com.flowercart.entity.Product;

import java.util.List;

public abstract class BasePricingStrategy implements PricingStrategy {

    public abstract List<Product> applyDiscount(List<Product> items);


    @Override
    public float calculateTotal(List<Product> items) {
        float totalCost = 0;
        for (Product item : items) {
            float costOfProduct = item.getDiscountedPrice();
            totalCost = totalCost + costOfProduct;
        }
        return totalCost;

    }



}
