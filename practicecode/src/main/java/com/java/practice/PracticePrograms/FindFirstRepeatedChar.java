package com.java.practice.PracticePrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatedChar {
    public static void main(String[] args) {
         String input = "Java is a programming language";
         String joinedStr = Stream.of(input.split(" ")).collect(Collectors.joining());
         Map<Character,Long> map = joinedStr.chars()
                .mapToObj(ch-> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new,Collectors.counting()));
      //  map.entrySet().forEach(System.out::println);

        System.out.println("The first repeated character : "+map.entrySet().stream()
                        .filter(entry-> entry.getValue()>1)
                        .map(ent -> ent.getKey())
                        .findFirst().get());

        System.out.println("The first non repeated character : "+
                        map.entrySet().stream()
                                    .filter(entry-> entry.getValue()==1)
                                    .map(ent -> ent.getKey())
                                    .findFirst().get()           
        );      
    }
}
