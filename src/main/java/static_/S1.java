package static_;

public class S1 {
    static int i;
    int j;

    public static void main(String[] args) {
        S1 s=new S1();
        S1 s1=new S1();
        s1.i=3;
        s1.j=4;
        s.i=5;
        s.j=6;
        System.out.println(
                s1.i+ " "+
                        s1.j+ " "+
                        s.i+ " "+
                        s.i+ " ");
    }
/*
What is the result?
A- 3 4 5 6
B- 3 4 3 6
C- 5 4 5 6
D- 3 6 4 6

Cozum:
Cevap C. s1 objesi i yi3 yapıyor. 2 satir sonra s objesi i yi 5 yapıyor. i static oldugu icin en son 5 olur.
yazdirma isi 5 olduktan sonra oldugu icin s ve s1 objeleri icin i 5 tir. j non static oldugu icin s1 objesi icin
4, s objesi icin ise 6 dir.

 */
}
