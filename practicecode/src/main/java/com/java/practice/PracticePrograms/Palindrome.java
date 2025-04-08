package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome {
    public static void main(String[] args) {
        String input = "MADAM";
        String out = Stream.of(input)
                .map(ch -> new StringBuilder(ch).reverse())
                .collect(Collectors.joining());
       System.out.println((input.equals(out)? "PALINDROME" : "NOT A PALINDROME")); 
        
    }
}
