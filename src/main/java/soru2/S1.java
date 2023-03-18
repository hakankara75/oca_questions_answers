package soru2;

public class S1 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = j += i / 5 ;
        System.out.println(i + " : " + j + " : " + k); // 10 : 22 : 22
    }
/* Sonuc nedir?
A. 10 : 20 : 22
B. 2 : 22 : 24
C. 10 : 20 : 30
D. 10 : 22 :22

Cevap D
Cozum
int k = j += i / 5 ; kodunda islem onceligine gore java okuma yapar. ilk basta bolme yapilir
i/5=2 daha sonra int k= j += 2 == > j=22 ==> k=22
 */
}
