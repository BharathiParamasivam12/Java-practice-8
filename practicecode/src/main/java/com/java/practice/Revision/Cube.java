package com.java.practice.Revision;

import java.util.Arrays;
import java.util.List;

public class Cube {
    public static void main(String[] args) {
          List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
          List<Integer> out = integerList.stream()
                    .map(x-> (x*x*x))
                    .filter(x-> x>50)
                    .toList();
        System.out.println(out);
    }
}
