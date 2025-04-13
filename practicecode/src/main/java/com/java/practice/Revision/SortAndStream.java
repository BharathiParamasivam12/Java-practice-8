package com.java.practice.Revision;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortAndStream {
    public static void main(String[] args) {
         int arr[] = { 99, 55, 203, 99, 4, 91 };
         Arrays.sort(arr);
         for(int i : arr){
            System.out.println(i);
         }
        Arrays.stream(arr).forEach(n->System.out.println(n));   
    }
}
