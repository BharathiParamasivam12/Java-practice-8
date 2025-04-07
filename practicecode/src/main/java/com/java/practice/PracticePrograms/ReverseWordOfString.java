package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordOfString {
    public static void main(String[] args) {
        String input = "Java is a programming language";
        String out = Arrays.stream(input.split(" "))
            .map(word -> new StringBuffer(word).reverse())
            .collect(Collectors.joining(" "));
        System.out.println(out);
    }

}
