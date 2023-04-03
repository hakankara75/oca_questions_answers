package string;

public class S2 {
    public static void main(String[] args) {
        String str=" ";
        str.trim();
        System.out.println(str.equals("")+" "+ str.isEmpty());
    }
/*
What is the result?
A. true true
B. true false
C. false false
D. false true

Answer: C
Cozum:
String str=" "; ile bosluk degeri atanmis. str.trim(); yapilmis ancak atama yapilmadigi icin str degeri degismez.
Dolayisiyla str.equals("") yani hiclige esit olamaz, bosluk degeri var. bosluk oldugu icin empty de olamaz.
 */

}
