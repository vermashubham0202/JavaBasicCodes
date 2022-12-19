package com.pidkui.new_date_time_api_demo;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeApiDemo2 {
    public static void main(String[] args) {

        // LocalTime.now() deals with system define time (It will print the current system time)
        LocalTime t = LocalTime.now();        // for human-readable time
        System.out.println(t);

        // print mentioned time
        t = LocalTime.of(02, 15, 02);
        System.out.println(t);

        // fetch all zones id
        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        // specify time zone
        t = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(t);

        // to print GMT	(for machine-readable time)
        Instant i = Instant.now();
        System.out.println(i);
    }
}
