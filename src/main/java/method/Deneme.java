package method;

public class Deneme {

    public static long square(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        int value = 9;
        long result = square(value);
        System.out.println("value = " + value);
    }

    /*
    Yandaki kod blogu calisirsa sonuc ne olur?
    A. -1
    B. 9
    C. 81
    D. 12. satirdan dolayıi CTE olusur
    E. Baska bir satirdan dolayi CTE olusur

    Cevap: B
    Cozum: yukaridaki metot icinin islemle bir alakasi yok. Main icinde value=9 olarak atanmistir.
    Bu atamadan sonra square() cagirilmistir. Ancak bunun value degerine bir etkisi olmamistir.
    Dolayisiyla yazdirma komutu 9 verir.
     */
}
