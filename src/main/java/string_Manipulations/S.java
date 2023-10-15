package string_Manipulations;

public class S {



    public static void main(String[] args) {
        String str1= "Java";
        String str2= new String("java");
        //10. satir

        {
            System.out.println("Equal" );
      //  }else{
            System.out.println("Not Equal" );
        }
    }

    /*
    Kod blokunda 10. satira asagidaki hangi secenek eklenirse "Equal" yazdirir.
    A- str1.toLowerCase();
    if(str1==str2)

    B- if(str2.equals(str1.toLowerCase()))

    C- str1.toLowerCase();
    if(str1.equals(str1.toLowerCase()))

    D- if(str1.toLowerCase() == str2.toLowerCase())

    Cevap:
    B sikkidir.
    Cunku == isleminde variable'larin hem degerleri hem referansa bakar.
    Dolayisiyla A sikkinda str1.toLowerCase(); kodu atamayi yapmadigi icin str1= "Java" dir.
    O zaman hem referans hem deger farklidir.

    B sikkinda str1.toLowerCase() sonucu parametre oldugu icin equal olur.

    C sikkinda parantez icindeki str1.toLowerCase() sonucu "java" oldugundan not equal'dir

    D sikkinda A sikkindaki gibi atama olmadigindan ve deger ve referanslar esit olmadigindan olmaz.
     */
}
