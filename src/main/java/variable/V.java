package variable;

public class V {
    public static void main(String[] args) {


    int a=3;
    int b=2;
    int c=1;
    int r1=a*b/c+1;
    int r2=a/b*c+1;
    int r3=a*(b/(c+1));
        System.out.println(r1+ ": "+ r2+ " : "+ r3);
}
/*
What is the result?

    A. 2 : 7 : 3
    B. 7 : 7 : 9
    C. 2 : 7 : 0
    D. 7 : 2 : 3


Cevap: D
Cozum: r1, 3*2=6 dir. işlem sirasi / dedir. 6/1=6 dir. 6+1=7
r2= 3/2= 1.5 dir. siradaki islem * dir. 1.5*1=1.5 en son + var. 1.5+1=2.5 dir. int oldugu icin 2 cikti verir.
r3 ise en icteki parantezden baslar. 1+1=2 dir. sonra bir sonraki parantezde 2/2 isleme girer. oda 1 olur.
en son parantez disinda 3 ile carpilir. sonuc 3 yazdirir.
    */
}