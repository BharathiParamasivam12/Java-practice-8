    package com.java.practice.Interview.Reference.Persistent;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Comparator;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.function.Function;
    import java.util.function.Supplier;
    import java.util.stream.Collectors;
    import java.util.stream.IntStream;
    import java.util.stream.Stream;

    public class Test {
        //Find the index of each character in a string
        public static void main(String[] args){
            String str = "abcabc";
    
            // Map<Object,List<Integer>> map =  IntStream.range(0, str.length())
            //                             .boxed()
            //                             .collect(Collectors.groupingBy(i -> String.valueOf(str.charAt(i))));
            // map.entrySet().forEach(System.out::println);

        Map<Character,List<Integer>> map = 
                IntStream.range(0, str.length())
                    .boxed()
                    .collect(
                        Collectors.groupingBy(
                            i -> str.charAt(i)
                        )
                    );
        map.entrySet().forEach(System.out::println);

        }
    }
