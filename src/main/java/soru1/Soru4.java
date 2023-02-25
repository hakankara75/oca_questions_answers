package soru1;

import java.util.function.Predicate;

public class Soru4 {
    public static void main(String[] args) {
//        Soru4 a1=new Soru4();
//        a1.go(insert code here);
//    }
//
//    void go(Predicate<Soru4>a){
//        Soru4 a2=new Soru4();
//        System.out.println(a.test(a2));
//    }
//    static int adder (int x, int y){
//        return x+y;
    }
}
/* Which code, inserted on line 8 above, will compile and run fine?
a)p-> 7<4
b)p<->5<6
c)u->{return adder(2,1)>2;}
d)None of the answers are correct

Doğru cevap seçeneği: c)u->{return adder(2,1)>2;}

satırdaki kodda, "go" metodu bir Predicate alır ve bu Predicate'in Soru4 türünden bir nesneyi test etmesini bekler.
"a.test(a2)" çağrısı, a2 nesnesini Predicate "a" ile test eder ve sonucunu ekrana yazdırır.
Bu nedenle, doğru bir kod bloğu için bir Predicate gereklidir. Seçenek c, "u" isimli bir Predicate oluşturur ve
"adder(2,1)>2" ifadesinin sonucunu döndürür. Bu ifade, 2 ve 1 sayılarının toplamının 2'den büyük olup olmadığını
kontrol eder ve sonucu true veya false olarak döndürür. Bu Predicate, Soru4 türünden bir nesne ile test edilebilir,
 bu nedenle 8. satıra "u->{return adder(2,1)>2;}" kodunu yazarsak program çalışır.
 */
