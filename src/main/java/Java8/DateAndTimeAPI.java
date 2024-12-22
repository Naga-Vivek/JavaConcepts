package Java8;

import java.util.*;
import java.time.*;
public class DateAndTimeAPI{
    public static void main(String args[]){
        Date d1 = new Date();
        System.out.println(d1);

        //d1.setMonth(5); //deprecated
        System.out.println(d1);

        d1.setTime(-8987698698L);
        System.out.println(d1);

        System.out.println("------------");

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.withMonth(5));
        System.out.println(ld.plusMonths(8));

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalTime lt2 = LocalTime.now(ZoneId.of("Singapore"));
        System.out.println(lt2);
        System.out.println("--------List of Zones----------");
        ZoneId.getAvailableZoneIds().stream().filter((s)->s.contains("Singapore")).sorted().forEach(System.out::println);
    }
}