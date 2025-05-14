package com.java.practice.Interview.Reference.Misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFord {
    public static void main(String[] args) {
        String input ="bharathi";  //output : 
        char[] in = input.toCharArray();
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        int i=0;
        int j= in.length-1;
        
    
        while(i<j){
                if(!vowels.contains(in[i]))
                    i++;
                else if( !vowels.contains(in[j])){
                    j--;
                }
                else{
                    char temp = in[i];
                    in[i] = in[j];
                    in[j] = temp;
                    i++;
                    j--;
                }
                  
                
            }
        for(int k=0; k<in.length;k++){
           System.out.println(in[k]);
        }
    

   List<Integer> input1 = Arrays.asList(1,1,2,2,3,3,7,7,9,11,1,3);

    System.out.println(input1.stream()
        .sorted()
        .collect(Collectors.toSet()));

    System.out.println(input1.stream()
        .distinct()
        .sorted()
        .toList());

    }
}
