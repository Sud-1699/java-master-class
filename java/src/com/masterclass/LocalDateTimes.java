package com.masterclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimes {
    public static void main(String[] args) {

        //Working With Date Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        //Working with Local Date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());

        //Working with Local Time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        //Working with specific date time same code for date as well as time
        LocalDateTime dateTimeOfPast = LocalDateTime.of(
                2022,
                Month.MARCH,
                1,
                14,
                55
        );
        System.out.println(dateTimeOfPast);
    }
}
