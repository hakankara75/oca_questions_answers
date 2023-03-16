package abstracts;
abstract class Planet {
    protected void revolve(){   // line 1

    }
    abstract void rotate(); // line 2
}

class Earth extends Planet{
   // void revolve(){ // line 3

 //   }

    protected void rotate(){    // line 4

    }
/*
Which two modifications, made independently, enable the code to compile? (Choose two.)
A. Make the method at line n1 public.
B. Make the method at line n2 public.
C. Make the method at line n3 public.
D. Make the method at line n3 protected.
E. Make the method at line n4 public.

Cevap: CD
Cozum: Soruda cte veren yer line 3 tur. cunku parent daki protected void revolve() daraltilip default olmus.
Bunun duzelmesi icin line 3'un public veya protected olmasi gerekir.
Child parent'i kisitlayamaz, aynı veya daha genis olabilir, dar olamaz.
private ve static classlar inherit edilemez. abstract ise private ve static olmaz.

 */
}