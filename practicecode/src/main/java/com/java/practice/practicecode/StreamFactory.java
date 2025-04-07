package com.java.practice.practicecode;

import java.util.stream.Stream;

public class StreamFactory {

    public static void main(String[] args) {
        Stream<Integer> streamIterate = Stream.iterate(0, x -> x+5)
                                            .limit(10);
        streamIterate.forEach(System.out::println);

        Stream<Double> streamGenerate = Stream.generate(Math::random).limit(10);
        streamGenerate.forEach(System.out::println);

        Stream<String> streamOf = Stream.of("Hi", "how", "hello");
        streamOf.forEach(System.out::println);

    }
    
}
