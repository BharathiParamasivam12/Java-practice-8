package com.java.practice.PracticePrograms;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateChars {
    public static void main(String[] args) {
        String input = "Java is a programming language";
        String joinedStr = Stream.of(input.split(" ")).collect(Collectors.joining());
        HashSet set = new HashSet<>();
        joinedStr.chars()
                    .mapToObj(ch-> (char) ch)
                    .filter(ch -> !(set.add(ch)))
                    .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
