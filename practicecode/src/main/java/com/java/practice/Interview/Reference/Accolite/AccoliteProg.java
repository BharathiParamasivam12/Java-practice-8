package com.java.practice.Interview.Reference.Accolite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccoliteProg {
    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([])"));     // true
        System.out.println(isValid("{{")); 

    }

    public static boolean isValid(String s) {
     Map<Character,Character> map = new HashMap<>();
     map.put('}', '{');
     map.put(']', '[');
     map.put(')', '(');
     Stack<Character> stack = new Stack<>();

    for(char i : s.toCharArray()){
      if(map.containsValue(i)){
        stack.push(i);
      }else if(map.containsKey(i)){
        if(stack.isEmpty() || stack.pop() != map.get(i)){
          return false;
        }
      }
    }
   
    return stack.isEmpty();

    }
}


/**
 * Example 1:
Input: s = "()"
Output: true
 
Example 2:
Input: s = "()[]{}"
Output: true
 
Example 3:
Input: s = "(]"
Output: false
 
Example 4:
Input: s = "([])"
Output: true
**/