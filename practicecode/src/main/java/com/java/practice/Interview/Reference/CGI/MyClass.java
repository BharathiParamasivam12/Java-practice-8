package com.java.practice.Interview.Reference.CGI;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
          String pathOfFile = "path of the file";
          try{
           List<Integer> listInput = Arrays.asList(12,7,29,2,9);
           HashSet<Integer> outSet = new HashSet<>();
           List<Integer> out = listInput.stream()
                    .filter(in -> !outSet.add(in))
                    .toList();
            System.out.println(out);
                if (!out.isEmpty()) {
                    System.out.println("True");
                }else
                    System.out.println("False");

          }catch(Exception e){
            e.printStackTrace();
          }
        

    }



  
}
