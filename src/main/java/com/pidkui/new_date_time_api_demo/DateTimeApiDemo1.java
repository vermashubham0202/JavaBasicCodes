package com.pidkui.new_date_time_api_demo;

/*
 * Features of New DateTime Api in Java8:
 * 		- It is immutable
 * 		- Simple to use
 * 		- Thread safe
 */

// new date-time api package
import java.time.LocalDate;
import java.time.Month;

public class DateTimeApiDemo1 {
    public static void main(String[] args) {

        // LocalDate.now() deals with system define date (It will print the current system date)
        LocalDate d = LocalDate.now();
        System.out.println(d);

        // print mentioned date
        d = LocalDate.of(1994, 2, 2);
        System.out.println(d);

        // mention month name
        d = LocalDate.of(1994, Month.FEBRUARY, 2);
        System.out.println(d);
    }
}
