package com.java.practice.Revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateIntegers {
    public static void main(String[] args) {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,8,15,49);
          System.out.println("The duplicates elements in the list : ");
          HashSet<Integer> set =  new HashSet<>();
          myList.stream()
                .filter(in-> !set.add(in))
                .toList().forEach(System.out::println);
    }
}
