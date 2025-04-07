package com.java.practice.practicecode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.practice.Model.Person;
import com.java.practice.Model.PersonRepo;

public class StreamGroupingBy {
    public static void main(String[] args) {
        List<Person> persons = new PersonRepo().getAllPersons();
       /** groupingBy(persons);
        groupingByKidsShowNames(persons);
        groupingByHobbies(persons);
        groupingByHeight(persons);
        groupingByHeightShowName(persons);
        groupingByHeightKidsCount(persons); 
        twoLevelGroupWithCount(persons);
        **/
        threeLevelGroup(persons);
    }
    public static void groupingBy(List<Person> personList){
       Map<Integer,List<Person>> map =  personList.stream()
                .collect(Collectors.groupingBy((Person::getKidsCount)));
        map.entrySet().forEach(System.out::println);
                
    }

    public static void groupingByKidsShowNames(List<Person> personList){
        Map<Integer,List<String>> map =  personList.stream()
                 .collect(Collectors.groupingBy(
                            (Person::getKidsCount),
                             Collectors.mapping(Person::getName, Collectors.toList())
                            )
                        );
         map.entrySet().forEach(System.out::println);
                 
     }

     public static void groupingByHobbies(List<Person> personList){
        Map<List<String>,List<Person>> map =  personList.stream()
                 .collect(Collectors.groupingBy((Person::getHobbies),Collectors.toList()));
       Stream.of(map).forEach(System.out::println);
                 
     }

     public static void groupingByHeight(List<Person> persons){
        Map<String, List<Person>> map = persons.stream()
                .collect(Collectors.
                    groupingBy(person -> person.getHeight()> 140 ? "Tallest" : "Shortest"));   

        map.entrySet().forEach(System.out::println);
     }


     public static void groupingByHeightShowName(List<Person> persons){
        Map<String, List<String>> map = persons.stream()
                .collect(
                    Collectors.groupingBy(
                        person -> person.getHeight()> 140 ? "Tallest" : "Shortest",
                        Collectors.mapping(Person::getName, Collectors.toList())
                        )
                    ); 

        map.entrySet().forEach(System.out::println);
     }

     public static void groupingByHeightKidsCount(List<Person> persons){
       Map<Integer,Map<Integer,List<Person>>> map =  persons.stream()
                .collect(
                    Collectors.groupingBy(Person::getKidsCount,
                    Collectors.groupingBy(Person::getHeight)
                    )
                );
        map.entrySet().forEach(System.out::println);
     }

     public static void twoLevelGroupWithCount(List<Person> persons){
       Map<String, Integer> map = persons.stream()
                .collect(
                    Collectors.groupingBy(Person::getName,
                    Collectors.summingInt(Person::getKidsCount)
                    ));

        map.entrySet().forEach(System.out::println);
     }
           
     public static void threeLevelGroup(List<Person> persons){
        Map<String, List<Person>> map = persons.stream()
                    .collect(
                        Collectors.groupingBy(
                            Person::getName,
                            HashMap :: new, 
                            Collectors.toList()
                        )
                    );
            map.entrySet().forEach(System.out::println);
     }
  
    
}
