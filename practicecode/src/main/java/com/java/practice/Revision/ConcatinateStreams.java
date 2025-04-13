package com.java.practice.Revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatinateStreams {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

       Stream<String> list3 = Stream.concat(list1.stream(),list2.stream());
       list3.forEach(System.out::println);
    }
}
