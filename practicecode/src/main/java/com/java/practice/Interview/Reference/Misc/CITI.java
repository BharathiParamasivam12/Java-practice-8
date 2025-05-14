package com.java.practice.Interview.Reference.Misc;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CITI {
    public static void main(String[] args) {

   
// Map<String, Object> result = empList.stream()
//     .filter(emp -> emp.getSalary() > 25000 && emp.getDept().equalsIgnoreCase("Technology"))
//     .collect(Collectors.teeing(
//         Collectors.mapping(EmpList::getName, Collectors.joining(", ")), // Collector for names
//         Collectors.summingInt(EmpList::getSalary),                      // Collector for total salary
//         (names, totalSalary) -> Map.of("names", names, "totalSalary", totalSalary)
//     ));

     //  Emp:  //id, name, salary, dept
       // filter empl -> dept ="tech", salary > 25k; map-> names,conact with ","
       //calculate total salary
       // 
    }

//     Comparator

//    empList = empList.stream()
//             .map(empList::getsalary)
//             .sorted(Comparator.reverseOrder())
//             .limit(2).min();

        

//   Map<String,Integer> map =  empList.stream()
//             .filter(emp -> emp.getSalary() > 25000 && emp.getDept().equalIgnorecase("Technology"))
//             .map(EmpList::getName)
//             .collect(Collectors.joining(",").andThen(Collectors.summingInt(EmpList::getSalary)));

}
