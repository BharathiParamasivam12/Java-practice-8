package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsortedWODupl {

    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1, 5};         
        int[] b = new int[] {8, 3, 9, 5};
        
        IntStream.concat(Arrays.stream(a), Arrays.stream(b))
            .sorted()
            .distinct().forEach(System.out::print);

    }

}
