package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class S1 {
    public static void main(String[] args) {

        LocalDateTime dt= LocalDateTime.of(2014,7,31,1,1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));

    }

    /*
What is the result?
A. An exception is thrown at runtime.
B. 07-31-2014
C.2014-07-31
D.2014-09-30

Cevap: C
Cozum: Immutable (değiştirilemez) variable larda atama yapilmazsa deger degismez.
        dt.plusDays(30);
        dt.plusMonths(1); ile  ay ve gun eklenmek istemis ama atama yapilmamis.
        Atama yapilmadigi icin dt ilk hali ile kalir.
     */
}
