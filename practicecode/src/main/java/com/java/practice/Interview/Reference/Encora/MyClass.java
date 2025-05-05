package com.java.practice.Interview.Reference.Encora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MyClass {

    public static void main(String[] args) {

        String s = new String("5");

      //  System.out.println(1 + 10 + s + 1 + 10); // whats the output

        int[] arr = { 0,0,1,1,1,2,2,3,3,4 }; //remove duplicates
      //  TreeSet<Integer> set = new TreeSet<>();
        int[] out = new int[arr.length];
        Arrays.sort(arr);
        int j=0;
        out[j] = arr[0];
        for(int i=1; i<arr.length;i++){
            if(out[j] != arr[i] ){
                j++;
                out[j] = arr[i];
            }
           
        }
         int count =0; 
    
        for(int i=0; i<out.length; i++){
            if(out[i]>0){
                count++;
                System.out.println(count);
            }
            
        }

    }

}
 
