package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementsList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println("By using Distinct operation: ");
        list.stream()
            .distinct()
            .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("By using set : ");
        list.stream()
            .collect(Collectors.toSet()).forEach(System.out::println);
    }
    
}
