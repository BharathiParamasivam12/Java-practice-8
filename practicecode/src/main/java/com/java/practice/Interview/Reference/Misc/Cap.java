package com.java.practice.Interview.Reference.Misc;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cap {
    public static void main(String[] args) {
        int[] arr = new int[]{3,8,9,10,7,8};
      Map<Integer,Long> map =  IntStream.of(arr)
            .boxed()
            .collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
            ));
      System.out.println(  map.entrySet()
            .stream()
            .collect(Collectors.maxBy(Map.Entry.comparingByValue())).get());

    }
}
