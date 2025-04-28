package com.java.practice.Revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMax {
    public static void main(String[] args) {
     //    List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        int[] myList = new int[]{10,15,8,49,25,98,98,32,15};
         
         System.out.println("The max no is :"+
                    Arrays
                    .stream(myList)
                    .boxed()
                    .collect(Collectors.maxBy(Comparator.naturalOrder())).get()
                    );
         System.out.println("The  other method for max no is :"+
                    Arrays.stream(myList)
                    .boxed()
                    .max(Integer::compare)
                    .get()
                    );
        System.out.println(
            IntStream.of(myList)
            .mapToObj(i-> (int)i)
                .collect(Collectors.maxBy(Comparator.naturalOrder())).get()

        );

        
    }
}
