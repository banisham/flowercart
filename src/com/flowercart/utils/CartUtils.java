package com.flowercart.utils;

public class CartUtils {

    public static double parseDiscountPercent(String discountPercent){
        double discountValue =  Double.valueOf(discountPercent.substring(0,discountPercent.indexOf("%")));
//      System.out.println("discountValue-------" + discountValue);
        return discountValue;
    }}
