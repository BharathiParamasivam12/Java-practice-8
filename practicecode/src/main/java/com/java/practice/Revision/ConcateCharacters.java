package com.java.practice.Revision;

public class ConcateCharacters {
    public static void main(String[] args) {
        char[] str1 = new char[]{'h','e','l','l','o'};
        
        char[] str2 = new char[]{'h','i'};
        StringBuffer sb = new StringBuffer();

        for(char i : str1){
            sb.append(i);
        }
         for(char i : str2){
            sb.append(i);
        }
        System.out.println(sb);
    }
}
