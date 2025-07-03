package com.java.practice.Revision2;

import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTemplate {
    public static void main(String[] args) {
        int[] numbers = new int[] { 4, 9, 8, 10, 10, 7, 3, 3, 21, 76, 1 };
        separateOddEven(numbers);
        System.out.println("________________________________________");
        removeDuplicates(numbers);
        System.out.println("________________________________________");
        findFrequencyOfCharacter();
        System.out.println("________________________________________");
        findElementFrequency();
        System.out.println("________________________________________");
        sortbyDecimalOrder();
        System.out.println("________________________________________");
        joinString();
        System.out.println("________________________________________");
        findMultiples();
        System.out.println("________________________________________");
        findMaxMin();
        System.out.println("________________________________________");
        mergeUnSortedArray();
        System.out.println("________________________________________");
        mergeUnSortedArrayWODupl();
        System.out.println("________________________________________");
        findThreeMaxMin();
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("________________________________________");

    }

    private static void separateOddEven(int[] input) {
        System.err.println("Odd or even : ");
        Map<Boolean, List<Integer>> oddEven = IntStream.of(input)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        oddEven.entrySet().forEach(System.out::println);
    }

    private static void removeDuplicates(int[] input) {
        System.err.println("Remove duplicates from int array : ");
        String uniqueValues = IntStream.of(input)
                .distinct()
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(uniqueValues);

    }

    private static void findFrequencyOfCharacter() {
        String input = "Java of the day";
        Map<Character, Long> map = input.chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("High Frequency characters : ");
        System.out.println(Optional.of(map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .toList()).get());

    }

    private static void findElementFrequency() {
        System.err.println("Find frequency of words : ");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
                "Note Book", "Pencil");
        System.out.println(stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    }

    private static void sortbyDecimalOrder() {
        System.err.println("Reverse decimal numbers : ");
        double[] input = new double[] { 12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12 };
        List<Double> out = DoubleStream.of(input)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();
        out.forEach(System.out::println);
    }

    private static void joinString() {
        System.err.println("Joining string with delimiter : ");
        String[] input = new String[] { "Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn" };
        System.out.println(Stream.of(input)
                .collect(Collectors.joining(",", "[", "]")));
    }

    private static void findMultiples() {
        System.err.println("Find multiples of 5 : ");
        int[] numbers = new int[] { 2, 90, 7, 10, 5, 8, 80 };
        IntStream.of(numbers)
                .boxed()
                .filter(number -> number % 5 == 0)
                .forEach(System.out::println);
    }

    private static void findMaxMin() {
        System.err.println("Find max and min : ");
        int[] numbers = new int[] { 2, 90, 7, 10, 5, 8, 80 };
        System.out.println("Max : " +
                IntStream.of(numbers)
                        .max()
                        .getAsInt());
        System.out.println("Min : " +
                IntStream.of(numbers)
                        .min()
                        .getAsInt());

    }

    private static void mergeUnSortedArray() {
        System.err.println("Merge unsorted arrays : ");
        int[] numbers = new int[] { 2, 90, 71, 10, 15, 8, 80 };
        int[] number2 = new int[] { 12, 9, 71, 100, 15, 1, 33 };
        System.out.println("Merged array : " +
                IntStream.concat(
                        IntStream.of(numbers),
                        IntStream.of(number2)).boxed()
                        .sorted()
                        .toList());

    }

    private static void mergeUnSortedArrayWODupl() {
        System.err.println("Merge unsorted arrays : ");
        int[] numbers = new int[] { 2, 90, 71, 10, 15, 8, 80 };
        int[] number2 = new int[] { 12, 9, 71, 100, 15, 1, 33 };
        System.out.println("Merged Array W/O Duplicates : " +
                IntStream.concat(
                        Arrays.stream(numbers),
                        Arrays.stream(number2))
                        .boxed()
                        .distinct()
                        .sorted()
                        .toList());

    }

    private static void findThreeMaxMin() {
        System.err.println("Find Max and Min 3 in arrays : ");
        int[] numbers = new int[] { 2, 90, 71, 10, 15, 8, 80 };
        System.out.println("Max 3 numbers : " +
                Arrays.toString(IntStream.of(numbers)
                        .boxed()
                        .sorted()
                        .limit(3)
                        .mapToInt(Integer::intValue)
                        .toArray()));

        System.out.println("Min 3 numbers : " +
                Arrays.toString(IntStream.of(numbers)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .limit(3)
                        .mapToInt(Integer::intValue)
                        .toArray()));
    }

}
