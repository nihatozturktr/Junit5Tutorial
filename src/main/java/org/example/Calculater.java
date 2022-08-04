package org.example;

import java.util.stream.DoubleStream;

public class Calculater {


     static double sum(double... num){
       return DoubleStream.of(num).sum();
    }

    static double  multiply(double... num){
        return DoubleStream.of(num).reduce(1,(a,b)-> a*b);
    }
}
