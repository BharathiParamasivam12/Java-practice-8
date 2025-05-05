package com.java.practice.Interview.Comcast;

import java.util.Arrays;
import java.util.List;

public class Myclass {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(33,17,54, 61, 1, 99, 13, 05, 18);
        System.out.println(myList.stream()
            .sorted()
            .map(in -> String.valueOf(in))
            .filter(in -> in.startsWith("1"))
            .toList());
    }
}
