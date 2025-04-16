package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.List;

public class FindSubstring {
    public static void main(String[] args) {
        String input = "HeMamahehema";
        List<String> list =   Arrays.stream(input.split("(?<=\\G.{2})"))
                    .filter(s-> !s.isEmpty())
                    .toList();
        list.forEach(System.out::println);
        Long count = list.stream()
            .filter(str -> str.equalsIgnoreCase("ma"))
            .count();
        System.out.println("The ma occurs : "+count);
       
            
    }
}
