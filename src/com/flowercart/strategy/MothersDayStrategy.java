package com.flowercart.strategy;

import com.flowercart.entity.Product;
import com.flowercart.entity.Toy;

import java.util.List;

public class MothersDayStrategy extends BasePricingStrategy {
    String discountPercent = "25%";

    @Override
    public List<Product> applyDiscount(List<Product> items) {
        float discountedPrice = 0;
        double discountValue = parseDiscountPercent(discountPercent)/100;
        for (Product item : items) {
            float costOfProduct = item.getPrice();
            if (item instanceof Toy) {
                discountedPrice = (float) (costOfProduct + (costOfProduct * discountValue));
                item.setDiscountedPrice(discountedPrice);
                item.setDiscountPercent(discountPercent);
            }
            else{
                item.setDiscountedPrice(item.getPrice());
                item.setDiscountPercent("0%");
            }
        }
        return items;
    }
}
