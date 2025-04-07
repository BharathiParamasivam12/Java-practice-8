package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find3MaxMin {
    public static void main(String[] args) {
             List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
            
            List<Integer> maxNos =  listOfIntegers.stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(3)
                        .toList();
            System.out.println("The first 3 max nos are : "+ maxNos);

            System.out.println("The first 3 min nos are : "+ 
                       listOfIntegers.stream()
                                .sorted()
                                .limit(3)
                                .toList() 
            );

      
    }
}
