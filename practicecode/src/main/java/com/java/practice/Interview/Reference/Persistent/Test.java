package com.java.practice.Interview.Reference.Persistent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args){
        String str = "abcabc";
   
        Map<Object,List<Integer>> map =  IntStream.range(0, str.length())
                                    .boxed()
                                    .collect(Collectors.groupingBy(i -> String.valueOf(str.charAt(i))));
        map.entrySet().forEach(System.out::println);
    }
}
