package com.company;

import java.util.TreeMap;

public class PolynomialExpressionsCalculator {

    PolynomialExpressionsCalculator(){
    }

     String addExpressions(TreeMap<Integer,Integer>map1, TreeMap<Integer,Integer> map2){

         for (Integer exponent:map2.keySet()) {
             if (map2.get(exponent) != 0) {
                 if (map1.containsKey(exponent)) {
                     int newConstant;
                     newConstant = map1.get(exponent) + map2.get(exponent);
                     map1.put(exponent, newConstant);
                 } else map1.put(exponent, map2.get(exponent));
             }
         }

        return buildString(map1);
    }


    private String buildString(TreeMap<Integer,Integer>map) {
       StringBuilder result=new StringBuilder();
       map.values().removeIf(value->value==0);
        System.out.println("first key:"+map.firstKey());
       for (Integer exponent:map.descendingKeySet()) {
            if(exponent==1&& !exponent.equals(map.firstKey()))result.append(map.get(exponent)+"x+");
            if(exponent==1&&exponent.equals(map.firstKey()))result.append(map.get(exponent)+"x");
            if(exponent==0&&map.firstKey()>=0)result.append(map.get(exponent));
            if(exponent==0&&map.firstKey()<0)result.append(map.get(exponent)+"+");
            if(exponent>1&&!exponent.equals(map.firstKey()))result.append(map.get(exponent)+"x^"+exponent+"+");
            if(exponent>1&&exponent.equals(map.firstKey()))result.append(map.get(exponent)+"x^"+exponent);
            if(exponent<0&&!exponent.equals(map.firstKey()))result.append(map.get(exponent)+"x^("+exponent+")+");
            if(exponent<0 &&exponent.equals(map.firstKey()))result.append(map.get(exponent)+"x^("+exponent+")");
       }
       return result.toString();
    }
}
