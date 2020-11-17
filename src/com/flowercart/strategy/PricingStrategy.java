package com.flowercart.strategy;

import com.flowercart.entity.Product;

import java.util.List;

public interface PricingStrategy {
    final int REGULAR = 99; // For RegularDay Strategy
    final int VALENTINE = 0; // For ValentinesDay Strategy
    final int MOTHER = 1; // For MothersDay Strategy

    public abstract float calculateTotal(List<Product> items);

}
