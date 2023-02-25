package soru1;

public class Soru8 {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        int k=(j+=i)/5;
        System.out.println(i+" : "+j+" : "+k);

    }
    /*
    What is the result?
    A. 10 : 30 : 6
    B. 10 : 22 : 22
    C. 10 : 22 : 20
    D. 10 : 22 : 6

    Cozum:
     A. 10 : 30 : 6 dir.
    int k=(j+=i)/5; satirinda parantez icinde j ye i yi ekliyor yani j=30 oluyor.
    k=30/5 oldugundan 6 olur. i ise zaten 10 dur.
     */
}
