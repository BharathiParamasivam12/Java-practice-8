package com.java.practice.Revision;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.util.comparator.Comparators;

public class FindMaxIntArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 3, 4, 4, 4, 5, 5, 4};
        Map<Integer, Long> map = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       int max =  map.entrySet()
                 .stream()
                 .max(Map.Entry.comparingByValue())
                    .get().getKey().intValue();
        System.out.println("The max value is "+max);
    
    }
}
