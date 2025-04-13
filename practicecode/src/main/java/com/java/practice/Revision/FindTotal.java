package com.java.practice.Revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTotal {
    public static void main(String[] args) {
         List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         long count = myList.stream()
                .collect(Collectors.counting());
                System.out.println("The total count is : "+count);
        System.out.println("Count is "+myList.stream().count());
    }
}
