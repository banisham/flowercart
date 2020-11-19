package com.flowercart.strategy;

import com.flowercart.entity.Flower;
import com.flowercart.entity.Product;

import java.util.List;

public class ValentinesDayStrategy extends BasePricingStrategy {
    String discountPercent = "15%";



    @Override
    public List<Product> applyDiscount(List<Product> items) {
        float discountedPrice = 0;
        double discountValue = this.parseDiscountPercent(discountPercent)/100;
        for (Product item : items) {
            float costOfProduct = item.getPrice();
            if (item instanceof Flower) {
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
