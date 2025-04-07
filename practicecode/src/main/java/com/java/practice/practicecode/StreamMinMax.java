package com.java.practice.practicecode;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.practice.Model.Person;
import com.java.practice.Model.PersonRepo;

public class StreamMinMax {
    
    public static void main(String[] args) {
        doMinMax(new PersonRepo().getAllPersons());
    }

    public static void doMinMax(List<Person> personList){
        System.out.println("Find max by age : ");
        System.out.println(personList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Person :: getAge))));

        System.out.println("Find Min by Height : ");
        System.out.println(personList.stream()
                .collect(Collectors.minBy(Comparator.comparing(Person :: getHeight))));
            
    }
}
