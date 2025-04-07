package com.java.practice.practicecode;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.practice.Model.Person;
import com.java.practice.Model.PersonRepo;

public class StreamPartitioning {
    public static void main(String[] args) {
        List<Person> persons = new PersonRepo().getAllPersons();
        partitionBy(persons);
        partitionByTwoValues(persons);
    }
    public static void partitionBy(List<Person> persons){
       Map<Boolean,Set<String>> map =
                             persons.stream()   
                                    .collect(
                                        Collectors.partitioningBy(
                                            per -> per.getKidsCount() > 2,
                                        Collectors.mapping(Person::getName, Collectors.toSet())
                                        )
                                     );
        map.entrySet().forEach(System.out::println);
    }

    public static void partitionByTwoValues(List<Person> persons){
        Map<Boolean, Map<String, List<String>>> map = persons.stream()
                    .collect(
                        Collectors.partitioningBy(
                            per-> per.getAge() > 30,
                            Collectors.toMap(Person::getName, Person::getHobbies)      
                        )
                    );
        map.entrySet().forEach(System.out::println);
    }
    
}
