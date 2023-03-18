package if_conditions;

public class A {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        if (x++ < ++y) {
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y);

    }
/*
Sonuc nedir?
A. Welcome Log 2:2
B. Hello Log 2 : 2
C. Hello Log 2:2
D. WelcomeLog 2:2

Cevap C
Cozum
 x if icinde post increment oldugu icin degeri 1 bu satirdan sonra 2 olur
 y ise pre increment oldugundan bu satirda dahil degeri 2 olur
bu yuzden if'in icindeki sart true olur ve consol'da Hello gorunur
sondaki printde de x post increment oldugu icin if icinden cikarken 2 olur.
dolayisiyla Log 2:2 yazdirir
 */
}
