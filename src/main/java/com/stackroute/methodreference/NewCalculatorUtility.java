package com.stackroute.methodreference;


import java.util.function.BiFunction;

/* Complete the class as per the requirements given in PROBLEM.md */
public class NewCalculatorUtility extends CalculatorUtility {
    @Override
    public double compute(int num1, int num2) {
        BiFunction<Integer, Integer, Double> product = (a, b) -> Math.pow(a, b);
        return product.apply(num1, num2);
    }

    public Double getPowerResult(int num1, int num2) {
        BiFunction<Integer, Integer, Double> getResult = this::compute;
        return getResult.apply(num1, num2);
    }

    public Double getProductResult(int num1, int num2) {
        BiFunction<Integer, Integer, Double> getResult = NewCalculatorUtility.super::compute;
        return getResult.apply(num1, num2);
    }
}

