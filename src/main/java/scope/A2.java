package scope;
public class A2 {
    public static void main(String[] args) {



//        do {
//            int y = 1;
//            System.out.print(y++ + " ");
//        } while(y <=10);
        }
    }
/*
Kod blogu calisirsa sonuc ne olur?
A. 1 2 3 4 5 6 7 8 9
B. 1 2 3 4 5 6 7 8 9 10
C. 1 2 3 4 5 6 7 8 9 10 11
D. 10.satirdan dolayi kod calismaz.
E. Kod sonsuz bir donguye girer.

Cevap D
Cozum: int y do while icinde tanimlanmis. while() icinde onu gorebilemsi icin do ustunde yani class member olarak tanimlanmaliydi.
Mesela 4-5-6. satirlardan birinde int y tanimlanip bir deger verilseydi kod calisirdi. Fakat bu durumda 10. satir hata verir.
 */
