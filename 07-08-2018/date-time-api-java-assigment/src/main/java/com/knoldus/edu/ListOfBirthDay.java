package com.knoldus.edu;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfBirthDay {

    public static List<String> getAllBirthDays() {

        LocalDate birthDate = LocalDate.of(1995, 9, 10);
        LocalDate presentDate = LocalDate.of(2018, 9, 10);

        int birthYear = birthDate.getYear();
        int presentYear = presentDate.getYear();

        List<String> list = IntStream.rangeClosed(birthYear, presentYear).boxed()
                .map(year -> LocalDate.of(year, 9, 10).getDayOfWeek().toString())
                .collect(Collectors.toList());
        System.out.println(list);
        return list;


    }


}
