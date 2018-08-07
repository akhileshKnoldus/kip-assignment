package com.knoldus.edu;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {

    public  static  void  getZone(String zone){
        ZoneId zoneId = ZoneId.of(zone);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), zoneId);
        System.out.println(
                zonedDateTime
                        .format(DateTimeFormatter
                                .ISO_ZONED_DATE_TIME));

    }




}
