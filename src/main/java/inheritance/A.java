package inheritance;

public class A {
    public A() {
        System.out.println("A");
    }
}
    class B extends A{
        public B() {    // line 1
            System.out.printf("B");
        }
    }
/*        class C extends B(){
        public C(){     //line 2
            System.out.println("C");

        }

        public static void main(String[] args) {
            C c = new C();
        }
    }
What is result?
A.  C
    B
    A
B. C
C.  A
    B
    C
D. Compilation fails at line 1 and line 2

Cevap C
Cozum: main icindeki C constructor u calisinca B ye gider o da A ya yollar. A icinde print calisir
A yazdirir. sonra B ye doner ve print B yi yazdirir. en son C ye geri doner ve C yazdirir.


 */