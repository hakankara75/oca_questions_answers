package soru1;

public class B {
    public static void main(String[] args) {

        A b1=new A(5);
        A []ba = go (b1, new A (6));
        ba[0]=b1;
        for (A b:ba)
            System.out.print(b.size+ " ");
    }
    static A [] go(A b1, A b2){
        b1.size=4;
        A []ma={b2,b1};
        return ma;
    }
}

/* çözüm:
13. satirda Main.A class daki size 4 olarak initialize edilir.
15. satida go metodu b2 ve b1 objeli ma arrayini return eder.
7. satirda ba arrayi go metodundan 2 obje ile oluşur. ={b2,b1};
8.satirda ba arrayinin ilk elemani b1 olur. boylece ba={b1,b1}
9. satirda for dongusu 2 elemanli ba arrayindan dolayi 2 defa doner.
10.satirda b, size i 4 olarak cagirir. 2 defa arada bir bosluk birakip 4 4 yazdirir.
 */
