package com.masterclass;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zones {
    //Working with Zone
    public static void main(String[] args) {
        //Working with Zone date time
        LocalDateTime nowInUS = LocalDateTime.now(ZoneId.of("US/Pacific"));
        LocalDateTime nowInIndia = LocalDateTime.now();

        System.out.println("Now In India: " + nowInIndia);
        System.out.println("Now In US: " + nowInUS);

        for(String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now());
    }
}
