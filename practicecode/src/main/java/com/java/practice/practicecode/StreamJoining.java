package com.java.practice.practicecode;

import java.util.List;
import java.util.stream.Collectors;

import com.java.practice.Model.Person;
import com.java.practice.Model.PersonRepo;

public class StreamJoining {
    public static void main(String[] args) {
        streamJoin(new PersonRepo().getAllPersons());
    }
    public static void streamJoin(List<Person> personList){
        String name =  personList.stream()
            .map(Person :: getName)
            .collect(Collectors.joining());
        System.out.println("Join all names without delimiters : "+name);

        String nameWithDelimit = personList.stream()
                                    .map(Person::getName)
                                    .collect(Collectors.joining(",","[","]"));
        System.out.println("Join all names without delimiters : "+nameWithDelimit);

    }
}
