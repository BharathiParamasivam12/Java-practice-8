package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInReverse {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);
    }
}
