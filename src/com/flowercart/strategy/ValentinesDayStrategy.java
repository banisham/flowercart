package com.flowercart.strategy;

import com.flowercart.entity.Flower;
import com.flowercart.entity.Product;

import java.util.List;

public class ValentinesDayStrategy implements PricingStrategy {
    @Override
    public float calculateTotal(List<Product> items) {
        float totalCost = 0;
        for (Product item : items) {
            float costOfProduct = item.getPrice();
            if (item instanceof Flower)
                costOfProduct = (float) (costOfProduct + (costOfProduct * 0.15));
            totalCost = totalCost + costOfProduct;
        }
        return totalCost;

    }
}
