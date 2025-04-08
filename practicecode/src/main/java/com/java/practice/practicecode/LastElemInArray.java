package com.java.practice.practicecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LastElemInArray {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Apple","Banana","Lemon", "Orange", "Grapes");
        System.out.println(new LinkedList<>(input).getLast());
        //or
        System.err.println(input.stream().skip(input.size()-1).findFirst().get());
                
    }
    
    
}
