package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeUnsortedArray {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1, 5};         
        int[] b = new int[] {8, 3, 9, 5};
 
        Stream.of(a,b) // stream of arrays
                .flatMapToInt(Arrays::stream) //flat the stream of arrays -> Intstream
                .sorted() //Int stream is the input for sorted
                .forEach(System.out::println);;
       
                // or
        
        IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted()
                .forEach(System.out::print);
        
    }
}
