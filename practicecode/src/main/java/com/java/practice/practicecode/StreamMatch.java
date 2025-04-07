package com.java.practice.practicecode;

import java.beans.PersistenceDelegate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.java.practice.Model.Person;
import com.java.practice.Model.PersonRepo;

public class StreamMatch {

    static Predicate<String> predicate = fruit -> fruit.length()>7;
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","banana","orangess","mango","grape");
        System.out.println("All Match : ");
        System.out.println(fruits.stream()
                .allMatch(fruit -> fruit.length()>5));

        System.out.println("Any Match : ");
        System.out.println(fruits.stream()
                        .anyMatch(predicate));
       System.out.println("Person Example : ");
        getHeightForaPerson(new PersonRepo().getAllPersons());
        
    }

    public static void getHeightForaPerson(List<Person> list){
        System.out.println(list.stream()
            .allMatch(person -> person.getHeight()>130));
        System.out.println(list.stream()
            .anyMatch(person -> person.getHeight()>120));
    }
}
