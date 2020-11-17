package com.flowercart.strategy;

import com.flowercart.entity.Product;
import com.flowercart.entity.Toy;

import java.util.List;

public class MothersDayStrategy implements PricingStrategy {
    @Override
    public float calculateTotal(List<Product> items) {
        float totalCost = 0;
        for (Product item: items ){
            float costOfProduct = item.getPrice();
            if(item instanceof Toy)
                costOfProduct = (float)(costOfProduct + (costOfProduct * 0.25));
            totalCost = totalCost + costOfProduct;
        }
        return totalCost;

    }
}
