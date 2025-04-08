package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartWithInteger {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six6");
        List<String> out = listOfStrings.stream()
                    .filter(str -> str.matches("^\\d.*"))
                    .collect(Collectors.toList());
        System.out.println(out);

    }
}
