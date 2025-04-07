package com.java.practice.PracticePrograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSumOfInteger {
    public static void main(String[] args) {
        Stream.iterate(0, (x)-> x+1).limit(20).forEach(System.out::println);

        int i = 12345;
        Integer out = Stream.of(
            String.valueOf(i).split(""))
            .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(out);   
        
        int j = String.valueOf(i)
                    .chars()
                    .map(Character::getNumericValue)
                    .sum();
        System.out.println("sum : "+j);   
     
        int sum = IntStream.range(0, 11).sum();
        System.out.println("sum of nos :"+sum);   
    }

}
