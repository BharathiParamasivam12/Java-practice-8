package com.java.practice.Revision;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueness {
    public static void main(String[] args) {
        int[] input = new int[]{10,15,8,49,25,98};
        System.out.println("The uniqueness : "+
        Arrays.stream(input)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(),
                                            Collectors.counting()))
            .entrySet()
            .stream()
            .anyMatch(entry -> entry.getValue()>1)
        );

    }
}
