package soru1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Soru5 {
    public static void main(String[] args) {
        ZoneId zone1= ZoneId.of("Europe/Berlin");
        ZoneId zone2= ZoneId.of("Europe/Dublin");

//        ----- now1= -----.now(zone1);
//        ----- now2= -----.now(zone2);,
//        System.out.println("Berlin Time: "+ now1);
//        System.out.println("Berlin Time: "+ now2);
    }
}
/*
What class, interested in the above empty spaces, will return the current local time for Berlin and Dublin?
a)DateTime
b)LocalDateTime
c)LocalTime
d)DateTimes
e)LocalDate

Cozum
LocalDateTime dir. Hem tarih hem de saati verir.
DateTime diye bir class yoktur.
LocalTime saat verir.
LocalDate ise tarihi verir.
 */