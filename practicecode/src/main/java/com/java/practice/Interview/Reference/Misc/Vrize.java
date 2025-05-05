package com.java.practice.Interview.Reference.Misc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Vrize {

    public static void main(String[] args) {
        String inputArr[] = {"1", "2","3","5","9", "a", "6", "7" ,"8" ,"4" ,"@", "-5", "-7" ,"-3", "-2" ,"-1"};
        List<Integer> in = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int j=0;

        for(String i : inputArr){
            try{
                 in.add(Integer.parseInt(i));
            }catch(Exception e){

            }
           
        }
     //  Collections.sort(in);
        System.out.println(in);
        for(int i=0; i<in.size()-2; i++){
           int a = in.get(i);
           int b = in.get(i+1);
           int c = in.get(i+2);
           if(doCheck(a,b,c)){
            System.out.println(a +" "+ b + " "+ c);
           }
        }
    }

    static boolean doCheck(int a, int b, int c){
      if(b == a+1 && c == b+1){
        return true;
      }
      return false;
        
    }

   
/**output
1 2 3
6 7 8
-3 -2 -1
**/
}
