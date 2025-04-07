package com.java.practice.practicecode;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkip {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","banana","orange","grapes");
        System.out.println("Limt example");
        list.stream()
            .map((fruit) -> (fruit.toLowerCase()))
            .limit(3).forEach(System.out::println);   

        System.out.println("Skip Example : ");
        list.stream()
            .skip(2).forEach(System.out::println);
            
        System.out.println(addLimitedValues(4,Arrays.asList(1,3,8,10,9,0)));

    }

    public static int addLimitedValues(int n, List<Integer> input){
        int out = input.stream() //stream of input list
                        .limit(n) //limit upto first 4 int
                        .reduce(0,(x,y)-> (x+y) ) //summation of first 4 limited integers
                        .intValue();
        return out;
    }
   
}
