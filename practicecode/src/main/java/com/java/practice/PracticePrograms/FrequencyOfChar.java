package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String input = "Java is a concept of the day";
        
        System.out.println("Input : "+ input);
       
        List<String> list = Arrays.asList(input.split(" "));

        Map<String, Integer> map = list.stream()
            .map(e -> e.toLowerCase())
            .collect(Collectors.groupingBy(Function.identity(),
                     Collectors.summingInt(String::length))
            );
            System.out.println("Group By words: ");
            map.entrySet().forEach(System.out::println);
    

           Map<Object,List<Object>> modifiedMap =  map.entrySet().stream()
                        .collect(Collectors.groupingBy(Map.Entry::getValue,
                          Collectors.mapping(Map.Entry::getKey, Collectors.toList()))
                        );
            
            System.out.println("Group By count : ");
      
            modifiedMap.entrySet().forEach(System.out::println);
      
            System.out.println("Group by each character using flat map: ");

            Map<Character, Long> mapChMap = list.stream()
                            .flatMapToInt(String::chars)
                            .mapToObj(c -> (char) c)
                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            mapChMap.entrySet().forEach(System.out::println);

            System.out.println("Group by each character : ");
            Map<Character,Long> chMap = input.chars() // converts string to char int stream 
                .mapToObj(c -> (char) c) // convert int character to normal character
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            chMap.entrySet().forEach(System.out::println);
    }

}
