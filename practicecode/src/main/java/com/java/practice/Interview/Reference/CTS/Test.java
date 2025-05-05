package com.java.practice.Interview.Reference.CTS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
    
    /**    List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> firstSort =list.stream()
            .sorted(Comparator.reverseOrder())
            .limit(2).toList();
        System.out.println("The second max no is : "+
            firstSort.stream().min(Comparator.naturalOrder()).get());
            
        
        String str="hghhgjhjhujsdddhhddh";
      Map<String, Long> map = Arrays.stream(str.split(""))
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().forEach(System.out::println);

        
**/
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,9,8);

        Thread thread = new Thread(
            ()-> {
                for(int i=0; i<list.size();i++){
                    System.out.println(list.get(i));
                }
            }
    
        );
        thread.start();
    
      //Add two numbers on lamda
      BinaryOperator<Integer> binaryOperator = (a,b) -> (a+b);
      Integer c = binaryOperator.apply(10, 20);
      System.out.println(c);


    }
}
