package do_while;
public class S2 {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, i= 10;
        do {
            i--;
            if (i == 8) keepGoing = false;
            result -= 2;
        }while (keepGoing);
        System.out.println(result);
        }
    }
/*
Kod blogu calisirsa sonuc nedir?
A. 7
B. 9
C. 10
D. 11
E. 15
F. 10. satirdan dolayi kod calismaz.

Cevap: D
Cozum: Kod calisinca i 9 olur. result 13 olur. keepGoing true oldugu icin dongu devam eder.
Kod ikinci kez calisir ve i 8 olur. if blok calisir keepGoing false olur. result 11 olur.
keepGoing false oldugunda do while dongusu biter ve sonuc 11 yazdirir.
 */
