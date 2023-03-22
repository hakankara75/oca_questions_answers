package condition;

public class S2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        /* insert code here*/

      //  System.out.println(str1 == str2);
    }
}
/* Which code fragment, when inserted at line 7, enables the code to print true?
A.	String str2 = str1;
B.	String str2 = new String(str1);
C.	String str2 = sb1.toString();
D.	String str2 = "Duke";

Cevap A
Cozum  == operatorunda sadece deger degil referanslarinda esit olmasi gerekir.
A sikki disindakilerde str2'ye sadece string deger olan "Duke" ataniyor.
Ancak A sikkinda str1 kopyasi str2ye ataniyor. Yani str1 kutusu, referans ve degeriyle birlikte str2ye kopyalaniyor.

 */