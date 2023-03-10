package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {
        String []arr= {"Hi", "How", "Are", "You"};
        List<String > arrList= new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(s -> {
            System.out.print(s);
            return s.length()<=2;})){
            System.out.println(" removed");

        }

    }
/*What is the result?
A. Compilation fails.
B. The program compiles, but it prints nothing.
C. HiHowAreYou removed
D. An UnsupportedOperationException is thrown at runtime.

Cevap: C
Cozum: arr arrayi arrList listesine donusturulmus.
lambda ile bu array if icine alinip akis saglanmis. bu akista s.length()<=2 ise removeIf ile silinmek istenmis.
yani ogelerden uzunlugu 2 ve alti olanlar silinir. dolayisiyle "Hi" silinir. geri kalanı 3 karakterdir, silinmez.
sonda da print icindeki "remove" yazilir. cunku s.length()<=2 ile "Hi" silindiginden if sarti true doner.
true da olunca "remove" yazdirir.
 */
}
