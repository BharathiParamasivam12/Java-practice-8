package com.java.practice.Interview.Reference.Misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.stream.IntStream;

public class Al extends Thread {
     
    @Override
    public void run() {
       System.out.println( doFileCheck());
    }
    public static void main(String[] args) {
       
        Thread t1 = new Al();
        Thread t2 = new Al();
        t1.start();
        t2.start();
         
              
    }


 public synchronized boolean doFileCheck(){
        System.out.println(Thread.class.getCanonicalName());
         String classPath = new String("c:\\xyz\\abc.csv");
        try{
             FileReader reader = new FileReader(classPath);
             if (reader.read() == 0) {
                return false;
             }
             else
                return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
       
    }
}



//    List<EmployeeList> employeeList  = null;
//    //to city wise 

//   Map<String, employeeList> empMap = 
//              employeeList.stream()
//             .collect(Collectors.groupingBy(
//                     employeeList::getCity,employeeList.toList()
//             ));
// }

// //binary search 

// int[] input = new int[]{1,3,4,6,7};
// input.sorted();
// // search 3; 
//     int median = input.length/2;
//     int target = 3; 
  
//     while(input.length!=null)
//     if(target <i){
//         for(int k=0; k<median; k++){
//             if(input[k] == target){

//                 return true;

//             }
//             k++;
//         }
//     }else{
//         for(  int j = median+1; j<input.length; j++){
//             if(input[j] == target){
//                 return true; 
//             }
//             j++;
//         }
//     }
//     return false;


