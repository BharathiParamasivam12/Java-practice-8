package com.java.practice.PracticePrograms;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class First10Odd {
    public static void main(String[] args) {
            Stream.iterate(new int[]{1,3}, f-> new int []{f[1],f[1]+2}).map(f-> f[0]).limit(10)
            .forEach(System.out::print);
    }
}
