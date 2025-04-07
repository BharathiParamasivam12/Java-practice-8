package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] in = new int[] {1,8,90,23,8};
        int[] out=  IntStream.rangeClosed(1, in.length)
                                    .map(i -> in[in.length-i])
                                    .toArray();
        System.out.println(Arrays.toString(out));
                
        
    }
}
