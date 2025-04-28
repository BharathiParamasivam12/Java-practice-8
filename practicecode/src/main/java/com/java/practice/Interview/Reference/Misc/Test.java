package com.java.practice.Interview.Reference.Misc;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] input = new String[]{"Apple", "Orange", "Orange", "Apple","Banana", "Orange"};
        
       // Apple, 2, [1,4]
      Map<String,Long> map = Stream.of(input)
                .map(i -> String.valueOf(i))
                .collect(Collectors.groupingBy(
                   Function.identity(), Collectors.counting()
                ));

    //    map.entrySet()
      //      .forEach(System.out::println);

           Map<String,List<Integer>> mapnew = IntStream.range(0, input.length)
                                                .boxed()
                                                .collect(Collectors.groupingBy(
                                                    i-> input[i],
                                                    LinkedHashMap::new,
                                                    Collectors.toList()
                                                ));

          for(String i : mapnew.keySet()){
                System.out.println(i+"="+mapnew.get(i).size()+"="+mapnew.get(i));      
          }        
    }
}
