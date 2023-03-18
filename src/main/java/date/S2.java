package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class S2 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}
/*
 What is the result?
A. May 04, 2014T00:00:00.000
B. 2014-05-04T00:00: 00.000
C. 5/4/14T00:00:00.000
D. An exception is thrown at runtime.
Answer: D
Cozum:
   String date = LocalDate.parse("2014-05-04") icine tarihten sonra saat atanmamis
   Bu nedenle ISO_DATE_TIME metotunda _TIME kismi fazla. Bu kaldirilsaydi ciktisi 2014-05-04 olurdu
Yada LocalDate.parse("2014-05-04") LocalDateTime.parse("2014-05-04T12:00:00") seklinde degistirilirse calisir
*/

