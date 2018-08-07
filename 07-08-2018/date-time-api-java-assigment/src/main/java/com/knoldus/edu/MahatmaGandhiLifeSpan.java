package com.knoldus.edu;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class MahatmaGandhiLifeSpan {

       public  static  void  lifeSpanInSecond(){
           LocalDate birth = LocalDate.of(1869, 9,2);
           LocalDate death = LocalDate.of(1948,1,30);
           long secondsInDay2 = ChronoUnit.DAYS.between(birth, death);
           System.out.println(secondsInDay2*60*60*24);

       }

}