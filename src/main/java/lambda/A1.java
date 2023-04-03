package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A1 {
    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};

        List<String> arrList = new ArrayList<>(Arrays.asList(arr));

        if(arrList.removeIf(s -> {System.out.print(s); return s.length() <= 2;} )){

            System.out.println(" removed");
        }
    }
}
/*
What is the result?

A.	Compilation fails.
B.	The program compiles, but it prints nothing.
C.	HiHowAreYou removed
D.	An UnsupportedOperationException is thrown at runtime.

Cevap: C
Cozum:
Arrays.asList(arr) ile array liste donustu.
if icinde listi s ile tek tek aldi ve yazdirdi.
return s.length() <= 2; sarti hep tutar cunku s nin icinde hep tek eleman var. o da lengthi 0 yapar.
dolayisiyla tum elemanlar yazilir.
en son bitince  System.out.println(" removed"); calisir.
 2<=2 her elemani calistracaktir
  // daha sonra elamanlari yazdirir elemanlar bittiginde removed yazdirir
  *
 */

