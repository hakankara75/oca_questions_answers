package ternary;

public class Ternary {

    public static void main(String[] args) {
        int x=5;
        System.out.println(x>2 ? x<4 ? 10 : 8 :7);
    }
    /*
    Yandaki kod bloku calistirildiginda output ne olur?
    A- 10
    B- 8
    C- 7
    D- Hata verir

    Cevap: Burada 2 ternary var. 1. icteki ternary x<4 ? 10 : 8
    Bunun sonucu 8'dir.
    Distaki ternary ise x>2 ? 8 : 7 dir.
     */
}
