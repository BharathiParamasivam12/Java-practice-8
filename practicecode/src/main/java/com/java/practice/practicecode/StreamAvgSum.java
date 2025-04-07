package com.java.practice.practicecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAvgSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,8,0,7,5,4);
        int sum = list.stream()
                        .collect(Collectors.summingInt(Integer::intValue));

        System.out.println("With summing "+sum);
        System.out.println( "without summing : "+list.stream().mapToInt(Integer::intValue).sum());

        double avg = list.stream()
                        .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("average : "+avg);
    }
}
