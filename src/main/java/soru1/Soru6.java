package soru1;

import java.time.LocalDate;
import java.time.Period;

public class Soru6 {
    public static void main(String[] args) {

        LocalDate date1=LocalDate.of(1977,10,15);
//        Period z= ------.------(date1, LocalDate.now());
//        System.out.println("You lived for:");
////        System.out.println("days: "+z.getDays());
////        System.out.println("Months: "+ z.getMonths());
////        System.out.println("Years: "+z.getYears());
    }

    /*
    What code insert above, will calculate the amount of days months and years from the date 15 October 1977?
    a) Period.between
    b) LocalDate.between
    c) Period.getPeriod
    d) DateTimes.getPeriod
    e)None of the answers are correct

    Cozum:
    Period.between dir. iki tarih arasindaki farki verir.
    LocalDate'in between komutu yoktur.
    Period'un getPeriod komutu yoktur.
    DateTimes diye bir class yoktur.
     */
}
