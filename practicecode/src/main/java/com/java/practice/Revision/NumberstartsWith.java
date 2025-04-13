package com.java.practice.Revision;

import java.util.Arrays;
import java.util.List;

public class NumberstartsWith {
    public static void main(String[] args) {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
          System.out.println("The integer starts with 1 : ");
          myList.stream()
                .map(in ->String.valueOf(in))  // .map(s-> s+"")
                .filter(e-> e.startsWith("1"))
                .toList().forEach(System.out::println);
    }
}
