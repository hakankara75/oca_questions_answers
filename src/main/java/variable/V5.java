package variable;

public class V5 {
    Character c;
    boolean b;
    float f;
    void printAll() {
        System.out.println("c = " + c); // c=null
        System.out.println("b = " + b); // b=false
        System.out.println("f = " + f); // f=0.0
    }
    public static void main(String[] args) {
        V5 f = new V5();
        f.printAll();
    }
}
/*
What is the result?
A. c=null b=true f=0.0
B. c= b=false f=0.0
C. c=null b=false f=0.0
D. c=0 b=false f=0.0F

Cevap C
Cozum: character'in default degeri null dir.
boolean'in default degeri false dir.
float'in default degeri 0.0 dir.



 */