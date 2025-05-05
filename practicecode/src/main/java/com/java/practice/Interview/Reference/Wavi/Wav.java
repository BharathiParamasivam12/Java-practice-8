package com.java.practice.Interview.Reference.Wavi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Wav {
    public static void main(String[] args) {
        String input = "aabbccvvsdfdsdssdsdssdsZ";
            Map<Character,Long> streamMap =  
                        input.chars()
                        .mapToObj(i-> (char)i)
                        .collect(Collectors.groupingBy(
                    Function.identity(),
                    LinkedHashMap::new,
                    Collectors.counting()
                ));
        System.out.println(streamMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .findFirst().get());
        
    }

}
