package com.java.practice.Revision;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
         List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
         Map<String, Long> map = names.stream()
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));
        System.out.println("Find the frequency of elements : ");

        map.forEach((k,v) -> System.out.println(k +" -> "+v));

        System.out.println("Find only the duplicate elements : ");
        map.entrySet()
            .stream()
            .filter(entry-> entry.getValue()>1)
            .forEach(System.out::println);
    }
}
