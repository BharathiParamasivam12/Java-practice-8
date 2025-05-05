package com.java.practice.Revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateIntegers {
    public static void main(String[] args) {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,8,15,49);
          System.out.println("The duplicates elements in the list : ");
          HashSet<Integer> set =  new HashSet<>();
          myList.stream()
                .filter(in-> !set.add(in))
                .toList().forEach(System.out::println);

        System.out.println("The duplicates elements in the int array : ");
       
        HashSet<Integer> dupSet = new HashSet<>();
        int[] input = new int[]{10,15,29,10,15,90,80};
            IntStream.of(input)
                        .mapToObj(i-> (int)i)
                        .filter(in -> !dupSet.add(in))
                        .forEach(System.out::println);

            Map<Integer, Long> map  = IntStream.of(input)
                        .mapToObj(i-> (int)i)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(System.out::println);
                   
    }
}
