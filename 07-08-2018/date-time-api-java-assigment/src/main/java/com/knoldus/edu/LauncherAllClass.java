package com.knoldus.edu;

public class LauncherAllClass {

    public static void main(String[] args) {

        System.out.println("List all your  birth date’s DayOfWeek till date");
        ListOfBirthDay.getAllBirthDays();

        System.out.println("Print current time of the given Time Zone");
        TimeZone.getZone("Europe/Zurich");


        System.out.println(" Print the number of seconds Mahatma Gandhi lived(ignore time consider only date).\n");
        MahatmaGandhiLifeSpan.lifeSpanInSecond();


        System.out.println("List All the leap years from 1900 till date");
        LeapYear.leapYear();
    }
}
