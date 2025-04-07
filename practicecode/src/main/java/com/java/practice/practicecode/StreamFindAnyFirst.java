package com.java.practice.practicecode;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.java.practice.Model.Person;
import com.java.practice.Model.PersonRepo;

public class StreamFindAnyFirst {
    static Predicate<Person> per = p -> (p.getKidsCount()>2);
    static Predicate<Person> per1 = p -> (p.getAge()>30);
    
    public static void main(String[] args) {
        System.out.println("Person : "+ findAny(new PersonRepo().getAllPersons()).get());
        System.out.println("Person find first : "+ findFirst(new PersonRepo().getAllPersons()).get());
    }

    public static Optional<Person> findAny(List<Person> personList){
        return personList.stream()
                .filter(per.and(per1))
                .findAny();
    }

    public static Optional<Person> findFirst(List<Person> personList){
        return personList.stream()
                .filter(per.and(per1))
                .findFirst();
    }
}
