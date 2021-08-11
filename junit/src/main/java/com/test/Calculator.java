package com.test;

public class Calculator {

    public int sum(String expression){

        int sum = 0;

        for (String valueSum : expression.split("\\+")){
            sum += Integer.parseInt(valueSum);

            System.out.println(sum);

        }
        return sum;
    }
}
