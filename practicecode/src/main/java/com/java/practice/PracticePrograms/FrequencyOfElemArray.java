package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfElemArray {
    public static void main(String[] args) {
        String[] inpuStrings = new String[]{"hELLO", "Hi","hello", "apple","hi"};
       // Arrays.asList(inpuStrings);
       Map<String,Long> map = Stream.of(inpuStrings) //stream of elements
            .map(String::toLowerCase)     
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().forEach(System.out::println);
    }
    
}
