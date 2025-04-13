package com.java.practice.Revision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Alice", 22));
        personList.add(new Person(2, "Mark", 32));
        personList.add(new Person(3, "Alice", 26));
        personList.add(new Person(4, "Katie", 25));
        personList.add(new Person(5, "Hemlet", 18));
        personList.add(new Person(6, "Zen", 35));
        
        personList.forEach(System.out::println);

        System.out.println("The sorted key by name : List to Map : ");

        Map<String,Map<Integer,Integer>> map =personList.stream()
                 .collect(Collectors.groupingBy(
                    Person::getPersonName,
                    TreeMap::new,
                    Collectors.toMap(Person::getPersonId, Person::getAge)));

        map.forEach((k,v) -> System.out.println(k + " => "+v));

          System.out.println("The sorted key by name and sorted by age in inside map: List to Map : ");

          Map<String, Object> sortedMap = 
          personList.stream()
                    .collect(Collectors.groupingBy(
                            Person::getPersonName,
                            TreeMap::new,
                            Collectors.collectingAndThen(
                                Collectors.toList(), 
                                list->{
                                    list.sort(Comparator.comparingInt(Person::getAge));
                                    return list;
                                })
                    ));

            sortedMap
            .forEach((k,v)-> System.out.println(k + " -> "+v));

                 
    }
}


class Person{
    int personId;
    String personName;
    int age;

    public void setPersonId(int personId){
        this.personId = personId;
    }

    public void setPersonName(String personName){
        this.personName = personName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getPersonId(){
        return personId;
    }

    public String getPersonName(){
        return personName;
    }

    public int getAge(){
        return age;
    }

    Person(int personId,String personName, int age){
          this.personId = personId;
               this.personName = personName;
                  this.age = age;
    }

    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id : "+ getPersonId()+
                ", Name : " +getPersonName()+
                ", Age : " +getAge();
    }



}
