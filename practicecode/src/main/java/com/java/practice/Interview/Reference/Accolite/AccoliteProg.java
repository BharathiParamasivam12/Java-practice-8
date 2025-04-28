package com.java.practice.Interview.Reference.Accolite;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccoliteProg {
    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([])"));     // true

    }

    public static boolean isValid(String s) {
      if(s.contentEquals(s))
        return true;
      return false;

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