package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithDelimiter {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        
        String out = listOfStrings.stream()
                    .collect(Collectors.joining(",","[","]"));
        System.out.println(out);
    }
}
