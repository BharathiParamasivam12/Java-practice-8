package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxMin {
    public static void main(String[] args) {
           List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
           Optional<Integer> max = listOfIntegers.stream()
                                    .collect(Collectors.maxBy(Comparator.naturalOrder()));
            System.out.println("Max : "+max.get());

            Optional<Integer> min = listOfIntegers.stream()
                                    .collect(Collectors.minBy(Comparator.naturalOrder()));
            System.out.println("Min : "+min.get());
}
    
}
