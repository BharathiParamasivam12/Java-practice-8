    package com.java.practice.Interview.Reference.Cargo;

    import java.util.Arrays;
    import java.util.LinkedHashMap;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Map;
    import java.util.function.Function;
    import java.util.stream.Collectors;
    import java.util.stream.IntStream;

    public class Cargo {
    /* Analyse and find the output for the below 3 codes
                                                Code1
    class basic 
    {
        static void show() 
        {
            System.out.println("1");
        }
        void instance() 
        {
            System.out.println("2");
        }
    }
    class simple extends basic 
    {
        static void show() 
        {
            System.out.println("3");// 
        }
        void instance() 
        {
            System.out.println("4");
        }
    }
    class Main
    {
        public static void main(String[] args)
        {
            basic obj = new simple();
            obj.show();
            obj.instance();
        }
    }------------------------------------------------------------------------------------------
                                                Code2
    class Program 
    {
    public static void main(String[] a)
    {
        new loan();
        new tax();
    }
    }
    class tax 
    {
        tax()
        {
        System.out.println("Income tax");
        }
    }
    class loan extends tax 
    {
        loan()
        {
        System.out.println("Interest tax");
        }
    }
    ------------------------------------------------------------------------------------------
                                            Code3
    public class Program 
    {
    public static void main(String[] args) 
    {
    test(null);
    }
    public static void test(Object obj) 
    {
    System.out.println("Left");
    }
    public static void test(String str) 
    {
    System.out.println("Right");
    }
    }
    ------------------------------------------------------------------------------------------
    Write a logic to display all the duplicate elements in the same order in how it appears in the array
    Test case 1: {1, 2, 3, 2, 4, 5, 2, 4}
    Output: 2,2,4,2,4 

    Test case 2: {1,2,3,2,4,3,5}
    Output: 2,3,2,3

    Test case 3: {1,2,3,4,4,3,5,1}
    Output: 1,3,4,4,3,1
    */

    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 2, 4, 5, 2, 4};
        Map<Integer,Long> map =    IntStream.of(numbers) 
                    .boxed()
                    .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                    )); 

                //1=1; 2=3;3=1;4=2;5=1 // value = freq
        map.entrySet().forEach(System.out::println);
        
    System.out.println( Arrays.stream(numbers)    //loop original
            .filter(in -> map.get(in)>1) //check duplicate (i.e >1 in map) and filter it in original list
            .boxed()
            .toList());
        
        
    }

    }
