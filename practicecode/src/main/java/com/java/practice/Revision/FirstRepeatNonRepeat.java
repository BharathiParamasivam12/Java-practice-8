package com.java.practice.Revision;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstRepeatNonRepeat {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
          Character nonRepeat =   input.toLowerCase().chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                            Function.identity(),LinkedHashMap::new,Collectors.counting()
                            )
                        )
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() ==1)
                        .findFirst()
                        .get().getKey();
        System.out.println("First non repeated character : "+nonRepeat);
     
        
         Character rep = input.chars()
                .mapToObj(ch -> Character.toLowerCase((char) ch))
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    LinkedHashMap::new,
                    Collectors.counting()
                )).entrySet()
                    .stream()
                    .filter(ent -> ent.getValue()>1)
                    .findFirst()
                    .get().getKey();

            System.out.println("First Repeated character : "+rep);
     
                        
    }
}
