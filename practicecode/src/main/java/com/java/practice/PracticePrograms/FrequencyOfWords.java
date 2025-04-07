package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String input = "Bob and alice are friends but bob and alice are not near";
        List<String> list = Arrays.asList(input.split(" "));
        Map<String,Long> map =list.stream()
            .map(e -> e.toLowerCase())
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().forEach(System.out::println);       
        
    }
}
