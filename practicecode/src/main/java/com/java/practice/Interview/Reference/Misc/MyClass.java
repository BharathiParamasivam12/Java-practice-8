package com.java.practice.Interview.Reference.Misc;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
    //Hashmap <String,String> 

   /** private final String key=null;
    private final String value = null; 

    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add(key);
        list.add(value)
        



    }

    public String getKey(){
        return this.key;
    }

    public String getValue(){
        return value;
    }

    public setKey(String key){
        int hash = key.hashCode();
        if()
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    **/

   
 
    public static void main(String[] args) {
         String input1 = "abcc";
    String input2 = "cbac";
      System.out.println( MyClass.isAnagram(input1,input2));

    }
    
public static boolean isAnagram(String input1,String input2){
    input1 = input1.chars()
            .mapToObj(ch -> (char)ch)
            .sorted().map(String::valueOf).collect(Collectors.joining());

    input2 = input2.chars()
            .mapToObj(ch -> (char)ch)
            .sorted().map(String::valueOf).collect(Collectors.joining());
    if(input1.equalsIgnoreCase(input2))
       { return true; }
    else
       { return false; }
}
 

}
