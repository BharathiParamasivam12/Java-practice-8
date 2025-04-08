package com.java.practice.practicecode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAge {
    public static void main(String[] args) {
        LocalDate bday = LocalDate.of(1991, 12,12 );
        LocalDate now = LocalDate.now();
        System.out.println("The age : "+ChronoUnit.YEARS.between(bday, now));
    }
}
