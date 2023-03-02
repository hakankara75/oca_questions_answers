package string;

public class S1 {
    public static void main(String[] args) {

String str= "Sweet Sweat";
String str2=str.trim().charAt(6)+""+str.indexOf("Sw",1);
        System.out.println(str2);
      }
/*
What is the result?
A- S6
B- S5
C- s-1
D- w7

Cevap: C sikki.
Cozum: tri ile en bas ve en sonda bosluk var ise sildik.
charAt(6) ile indexte 6. harf olarak 'S' alinir.
"Sw"nin gorundugu index olarak da 6 gelir.
 */
}
