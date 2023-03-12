package variable;

public class V4 {
    static double area;
    int b=2, h=3;

    public static void main(String[] args) {
        double p, b, h;     //line 1
             if (area==0){
            b=3;
            h=4;
            p=0.5;
            area=p*b*h;     //line 2
          }
        System.out.println("Area is: "+area);
    }
/*What is the result?

A. Area is 6.0
B. Area is 3.0
C. Compilation fails at line 1
D. Compilation fails at line 2

Cevap A
Cozum: area static oldugu icin main icinde kullanilir. Deger verilmedigi icin default 0 dir.
Bu nedenle if calisir. if calisinda b ve h degeri olarak main icindekiler alinir.
 print icindeki carpim sonucu 6.0 double olur.
 */
}
