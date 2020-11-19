package com.flowercart.strategy;

import com.flowercart.entity.Product;

import java.util.List;

public class RegularStrategy implements PricingStrategy {
    @Override
    public float calculateTotal(List<Product> items) {
        float totalCost = 0;
        for (Product item : items) {
            float costOfProduct = item.getDiscountedPrice();
            totalCost = totalCost + costOfProduct;
        }
        return totalCost;

    }

    @Override
    public List<Product> applyDiscount(List<Product> items) {
        float discountedPrice = 0;
        for (Product item : items) {
            float costOfProduct = item.getPrice();
            discountedPrice = (float) (costOfProduct + (costOfProduct * 0.0));
            item.setDiscountedPrice(discountedPrice);
            item.setDiscountPercent("0%");

        }
        return items;
    }
}
