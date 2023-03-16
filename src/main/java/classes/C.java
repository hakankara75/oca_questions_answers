package classes;

public class C {
    class C1 {}
    class C2 extends C1 {}
    class C3 extends C2 {}
 //   and the code fragment:
 C1 obj1 = (C1) new C2();
C2 obj2 = (C2) new C3();
 C2 obj3 = (C2) new C1();
 C3 obj4 = (C3) obj2;

/*
Which line throws ClassCastException?
A. line 18
B. line 17
C. line 19
D. line 16
Cevap: D
Cozum: cunku D sikkinda child C2, parent C1'e cast yapilmaya calisiliyor. child parent a cast edilemez.

 */
}
