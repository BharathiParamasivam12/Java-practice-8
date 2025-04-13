package com.java.practice.Revision;

import java.util.Arrays;
import java.util.List;

public class FindEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println("The even nos on the list is : ");
        list.stream()
            .filter(in -> in%2==0)
            .toList().forEach(System.out::println);
    }
    
}
