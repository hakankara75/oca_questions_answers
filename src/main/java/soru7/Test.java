package soru7;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            method1();
        }catch (MyException ne){
            System.out.println("A");
        }
    }

    public static void method1(){ // line n1
        try {
            throw 3>10 ? new MyException(): new IOException();
        }catch (IOException ie){
            System.out.println("I");
        }catch (Exception re){
            System.out.println("B");
        }
    }
}
/*What is the result?
A. A
B.AB
C.A compile time error occurs at line n1.
D.B
E. I
Cozum:
method 1 calisinca throw kisminda IOException calisir. o da I yazdirir.
Throw kismi method1 e hata verdirmedigi icin main icindeki try da sorun cikmaz, catch calismaz.
 */
