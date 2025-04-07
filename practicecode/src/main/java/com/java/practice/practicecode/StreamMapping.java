package com.java.practice.practicecode;

import java.util.List;
import java.util.stream.Collectors;

import com.java.practice.Model.Person;
import com.java.practice.Model.PersonRepo;

public class StreamMapping {
    public static void main(String[] args) {
        List<Person> persons = new PersonRepo().getAllPersons();
        getListPersons(persons);
        getTallestPerson(persons);
    }

    public static void getListPersons(List<Person> persons){
        persons.stream()
            .collect(Collectors.mapping(Person::getName,  Collectors.toSet()))
                        .forEach(System.out::println);;
    }

    public static void getTallestPerson(List<Person> list){
       System.out.println( list.stream()
            .filter(per -> per.getHeight()>135)
            .collect(Collectors.counting()));
    }
}
