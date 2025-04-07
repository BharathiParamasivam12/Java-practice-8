package com.java.practice.practicecode;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamMapTo {
    public static void main(String[] args) {
        System.out.println(map2Double());
        System.out.println(map2Long());
        System.out.println(int2List());
    }

    public static double map2Double(){
            return IntStream.range(1, 10) // get range of values in primitive datatype
                            .mapToDouble(x-> x) // converts int to double
                            .sum();
    }

    public static long map2Long(){
        return IntStream.rangeClosed(1,10 )
                        .mapToLong(x->x)
                        .sum();
    }

    public static List<Integer> int2List (){
        return IntStream.range(1, 10)
                        .mapToObj(x-> x)
                        .collect(Collectors.toList());
    }
}
