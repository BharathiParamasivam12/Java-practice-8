package com.java.practice.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionalsample {
    public static void main(String[] args) {
         List<String> names = Arrays.asList("AA", "BB", "AA", "CC" );
         List<String> empList = null;
         Optional.ofNullable(empList).ifPresentOrElse(list-> {
            System.out.println(list);
         }, ArrayList::new);
    }
}
