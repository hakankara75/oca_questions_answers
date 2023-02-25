package soru1;

public class Soru7 {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        if (x++ < ++y){
            System.out.print("Hello ");
        }else {
            System.out.print("Welcome ");
        }
        System.out.println("Log "+x+ ":"+y);
    }
}
/* What is the result?
A. Hello Log 2:2
B. Welcome Log 1:2
C. Welcome
Log 2:1
D. Hello
Log 1:2

Cozum
Hello Log 2:2
if icinde x++ dedigi icin x=1 dir. Yani once x i 1 olarak okur. Toplama islemi sonra yapilir.
 ++y toplamayi once yaptigindan y=2 dir. Dolayisiyla Hello yazdirir.
 sonra da if disindeki Log yazdirip x nin de toplama islemi
gerceklestiginden yerine 2, y zaten 2 idi. Hello Log 2:2 yazdirir.
 */
