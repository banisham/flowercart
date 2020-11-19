package com.flowercart.strategy;

import com.flowercart.entity.Product;

import java.util.List;

public class RegularStrategy extends BasePricingStrategy {
    String discountPercent = "0%";

    @Override
    public List<Product> applyDiscount(List<Product> items) {
        float discountedPrice = 0;
        double discountValue = this.parseDiscountPercent(discountPercent)/100;
        for (Product item : items) {
            float costOfProduct = item.getPrice();
            discountedPrice = (float) (costOfProduct + (costOfProduct * discountValue));
            item.setDiscountedPrice(discountedPrice);
            item.setDiscountPercent(discountPercent);

        }
        return items;
    }
}
