package com.java.practice.Interview.Reference.Intellias;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyClass {
     static List<String> dictionary = Arrays.asList("Java", "mongo", "java", "python", "java");
     static   BiPredicate<String, String> checkCaseSensitive = (a,b) -> (a.equals(b));
     static   BiPredicate<String, String> checkCaseInSensitive = (a,b) -> (a.equalsIgnoreCase(b));
      
    public static void main(String[] args) {
        MyClass cMyClass =  new MyClass();
    
          System.out.println(doOcuurenece("java", false));
       }
    

    public static long doOcuurenece(String word, boolean check){
        long count = 0;
        BiPredicate<String,String> comparator = check ? checkCaseSensitive : checkCaseInSensitive;

        return dictionary.stream()
            .filter(item -> comparator.test(word, item))
            .count();
    
      /**  for(String i : dictionary){
        
            if(comparator.test(i, word)){
                count++;
            }
        }
            return count;
            **/
       
    }
}
