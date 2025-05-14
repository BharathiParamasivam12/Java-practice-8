package com.java.practice.Revision;

public class CountIntegers {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
       
        while (num > 0){
            int last = num % 10;
            sum += last;
            num = num /10; 
        }
       System.out.println(sum);
    }
}
