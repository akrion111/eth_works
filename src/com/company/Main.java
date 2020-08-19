package com.company;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        PolynomialExpressionsCalculator calculator=new PolynomialExpressionsCalculator();
        //Key-exponent Value- constant
        TreeMap<Integer, Integer> input1=new TreeMap<>();
        TreeMap<Integer,Integer> input2=new TreeMap<>();
        //input1
        //2x^2+2x+3
        input1.put(2,2);
        input1.put(0,3);
        input1.put(1,2);
        //input2
        //3x^3+x^2
        input2.put(3,3);
        input2.put(2,1);
        System.out.println(calculator.addExpressions(input1,input2));
        //output
        //3x^3+3x^2+3


        TreeMap<Integer, Integer> input3=new TreeMap<>();
        TreeMap<Integer,Integer> input4=new TreeMap<>();
        //input3
        //x^5+x+x^(-5)
        input3.put(5,1);
        input3.put(1,1);
        input3.put(-5,1);
        //input4
        //x^2+5+4x^(-5)
        input4.put(2,1);
        input4.put(0,5);
        input4.put(1,4);
        input4.put(-5,4);
        System.out.println(calculator.addExpressions(input3,input4));
        //output
        //x^5+x^2+5x+5+5x^(-5)
    }
}
