package com.java.practice.Interview.Reference.Nokia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Service {
//     @MyLog
//     public void myMethod(){
//         System.out.println(Service.class.getMethods());
//     }
// }



// //Employee - collection 
// aggregate with city 

// {
    
// }

// db.getCollection("Employee").find({"agg:{Employee.city}"})



public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>(); //find any one employee with age>60 

    employeeList.stream()
          //  .filter(Objects::nonNull)
            .filter(emp ->  emp.getAge() > 60)
            .findFirst()
            .ifPresent(System.out::println);

}
}

class Employee{
    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    int getAge(){
        return age;
    }
} 
