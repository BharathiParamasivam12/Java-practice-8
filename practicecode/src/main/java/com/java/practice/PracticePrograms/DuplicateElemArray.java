package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElemArray {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Map<String,Long> map = listOfIntegers.stream()
                .map(in -> String.valueOf(in))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      
        List<Object> list = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue()>=2)
                .map(entry-> entry.getKey())
                .collect(Collectors.toList());
        list.forEach(System.out::println);

            //or
        System.out.println("============================");

        HashSet<Integer> set = new HashSet<>();
        listOfIntegers.stream()
                    .filter(in -> !set.add(in))
                    .collect(Collectors.toSet())
                    .forEach(System.out::println);
        
              

    }
}
