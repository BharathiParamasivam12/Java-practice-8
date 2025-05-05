package com.java.practice.Revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIntegers {
    public static void main(String[] args) {
         List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         System.out.println("The sorted list is : ASC Order");
         myList.stream()
                .sorted()
                .toList().forEach(System.out::println);
        
         System.out.println("The sorted list is : DESC Order");
         myList.stream()
                .sorted(Comparator.reverseOrder())
                .toList().forEach(System.out::println);
    }
}
