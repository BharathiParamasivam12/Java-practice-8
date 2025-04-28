package com.java.practice.Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test  {
    
 

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 3, 4, 4, 4, 5, 5, 4};
        
       Map<Integer, Long> map =  IntStream.of(array)
                                .mapToObj(i -> (int)i)
                                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                            
            map.entrySet().forEach(System.out::println);

            System.out.println("The max occurence is : "+
                        map.entrySet().stream()
                              .max(Map.Entry.comparingByValue())
                              .get().getKey()  
            );

            BinaryOperator<Integer> binaryOperator = (a, b) -> (a+b);

            System.out.println(binaryOperator.apply(2, 3));

    }
                
            
}



