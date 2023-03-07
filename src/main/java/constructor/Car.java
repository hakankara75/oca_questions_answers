package constructor;

import soru3.C;

public class Car extends Vehicle{
    int y;

     Car() {
       super(10);   //line 2
    }

     Car(int y) {
         super(y);
        this.y = y;
    }
public String toString(){
         return super.x+ ":"+this.y;
}
    public static void main(String[] args) {
        Vehicle y=new Car(20);
        System.out.println(y);
    }
/*
What is the result?
A. Compilation fails at line 2
B Compilation fails at line 1
C. 20:20
D. 10:20

Cevap 20:20
Cozum: main calisinca Vehicle sinifindan y variable 20 olur. Bu bizi Car classtaki parametreli constructor a
goturur. O da super(y) ile bizi Vehicle class a parametreli constructor a goturur. Orada 20 parametresi
x i 20 yapar sonra geldigi yere doner. oradan geri main icine gelir. Main de sout kismi toString e gonderir.
toString icine x ve y 20 oldugundan 20 : 20 olur.
 */

}
