package com.java.practice.practicecode;


public class FunctionalInterfaceExample {
    

@FunctionalInterface
public interface FunctionalInterface1 {
    public void myMethod();
    default void errorClass(){
        System.out.println("default method");
    }
    static void staticMethod(){
        System.out.println("static method allowed");
    }
    
}

}
