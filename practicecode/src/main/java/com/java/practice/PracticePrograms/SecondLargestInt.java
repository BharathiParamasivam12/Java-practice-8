package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestInt {
    public static void main(String[] args) {
         List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         Integer secondLargestNo = listOfIntegers.stream()
                    .sorted(Comparator.reverseOrder())
                    .skip(1).toList().get(0);
        System.out.println(secondLargestNo);     
    }
}
