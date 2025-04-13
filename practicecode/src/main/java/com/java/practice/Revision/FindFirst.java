package com.java.practice.Revision;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
          int firstNum = myList.stream()
                                .findFirst()
                                .get();
         System.out.println("The first Number in the list : " +firstNum);


         int[] intArrays = new int[]{10,15,8,49,25,98,32};
         int firstNo = Arrays.stream(intArrays).boxed().findFirst().get();
         System.out.println("The other method first no :"+firstNo);
    }
}
