package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCommonElem {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
      
        list1.stream().filter(list2::contains).toList().forEach(System.out::println);;
      
    }
}
