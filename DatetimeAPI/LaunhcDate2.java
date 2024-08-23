package DatetimeAPI;

import java.time.*;
public class LaunhcDate2 {
    public static void main(String[] args) {
        // After Launching the java8 Java Launched the time package it is launched by Jora-API, Heare we are not using the 'new' keyword, Heare we created object using Now method

        // Date Class
           LocalDate Date = LocalDate.now();
           int day = Date.getDayOfMonth();
           int month = Date.getMonthValue();
           int year = Date.getYear();
   
           System.out.println(Date);
           System.out.println(day + "/" + month + "/"+ year);
           System.out.println(day);
           System.out.println(month);
           System.out.println(year);


        // Time Class
           LocalTime Time = LocalTime.now();
           int hour = Time.getHour();
           int munite = Time.getMinute();
           int second = Time.getSecond();
           int neno_second = Time.getNano();
   
           System.out.println(Time);
           System.out.println(hour + "-" + munite + "-" + second + "-" + neno_second);

    }
}
