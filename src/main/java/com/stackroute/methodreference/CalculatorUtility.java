package com.stackroute.methodreference;

import java.util.function.BiFunction;

/* Complete the class as per the requirements given in PROBLEM.md */
public class CalculatorUtility {

    public double compute(int num1,int num2)
    {
        BiFunction<Integer,Integer,Double> product=(a, b)-> Double.valueOf(a*b);
        return product.apply(num1,num2);
    }
}
