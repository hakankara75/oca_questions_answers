package variable;

public class V2 {
    Character c;
    boolean b;
    float f;
    void printAll(){
        System.out.print(" c= "+c);
        System.out.print(" b= "+b);
        System.out.print(" f= "+f);
    }

    public static void main(String[] args) {
        V2 v= new V2();
        v.printAll();
    }
/*
What is the result?
A.  c= null b= true f= 0.0
B   c=      b= false f= 0.0
C.  c= null b= false f= 0.0
D.  c= 0    b= false f= 0.0F

Cevap: C
Cozum: c, b, f initialize edilmemistir. dolayisiyla hepsi null verir.
C char oldugu icin null deger verir.
b boolean oldugu icin false verir
f ise float oldugu icin 0.0 verir
 */
}
