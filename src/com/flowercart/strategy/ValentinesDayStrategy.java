package com.flowercart.strategy;

import com.flowercart.entity.Flower;
import com.flowercart.entity.Product;

import java.util.List;

public class ValentinesDayStrategy implements PricingStrategy {
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
            if (item instanceof Flower) {
                discountedPrice = (float) (costOfProduct + (costOfProduct * 0.15));
                item.setDiscountedPrice(discountedPrice);
                item.setDiscountPercent("15%");
            }
        }
        return items;
    }
}
