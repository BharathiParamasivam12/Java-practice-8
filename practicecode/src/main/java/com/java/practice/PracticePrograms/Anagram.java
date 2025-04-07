package com.java.practice.PracticePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        
        s1 = Stream.of(s1.split(""))  // convert into stream ['R','a','c','e']
                    .map(String::toLowerCase) //convert into lowercase
                    .sorted() //sort the stream
                    .collect(Collectors.joining());

        //System.err.println(s1);

        s2 = Stream.of(s2.split(""))  // convert into stream
        .map(String::toLowerCase) //convert into lowercase
        .sorted() //sort the stream
        .collect(Collectors.joining());
            
        //System.err.println(s2);

        System.out.println(checkAnagram(s1,s2));
     
    }
    public static String checkAnagram(String s1, String s2){
        if(s1.equals(s2))
            return "ANAGRAM";
        else
            return "NOT AN ANAGRAM";
    }

}
