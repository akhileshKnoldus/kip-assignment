package com.knoldus.edu;

import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeapYear {

 public  static  void leapYear() {
     int currentYear = Year.now().getValue();
     List leapYearList = IntStream.range(1900, currentYear).boxed()
             .filter(year -> Year.of(year).isLeap())
             .collect(Collectors.toList());

     System.out.println(leapYearList);
 }

}
