package com.java.practice.Interview.Reference.Wavi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestWav {
    public static void main(String[] args) {
        int[] input = new int[]{2,29,12,9,12,5,-2,10,1,0,3,4,11,6,-1,7};

        List<String> in = Arrays.asList("Hello", "Good", "Morning");
        // System.out.println(in.stream()
        //     .collect(Collectors.joining(" ")));
      
        Set<List> set = new HashSet<>();
         List<Integer>  list = null;
        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length; j++){
                if(input[i]+input[j] == 9){
                    list = new ArrayList<>();
                    list.add(input[i]);
                    list.add(input[j]);
                }
            }
            set.add(list);
        }
        
        System.out.println(set);
      
    //   System.out.println(  IntStream.of(input)
    //     .boxed()
    //     .reduce((a,b)-> a+b).get());
        
        // Arrays.sort(input);

        
        

        //target = 9; 
        //target - left[i] = r
        //loop if(input[i]==[r])
        //[lef[i],inpt[r]]
    }

    // public static List<List<Integer>> doCheck(int[] input){
    //     int target = 9;
    //     List<List<Integer>> list = new ArrayList<>();
    //     List<Integer> innerList = new ArrayList<>();
    //     int[] left = new int[input.length];
    //     left[0] = input[0];
    //     for(int i=1; i<input.length; i++){
    //        for(int j = i+1; j<input.length; j++){
    //         if(target - left[j] == input[i]){
                
    //             innerList.add(input[i]);
    //             innerList.add(left[j]);
    //         }
    //        }
    //        list.add(innerList);
    //     }
    //     return list;
    // }
}
