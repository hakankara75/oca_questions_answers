package soru6;


public class B extends A {
    static     {
        System.out.println("static block B");
    }

    {
        System.out.println("Non static block B");
    }


    public static void main(String[] args) {
        B b=new B();
    }

}
/* Cozum: Hakan Kara: public class A {
    {
        System.out.println("Non static block A");
    }
static     {
        System.out.println("static block A");
    }

}
[16:25, 24.02.2023] Hakan Kara: public class B extends A {
    static     {
        System.out.println("static block B");
    }

    {
        System.out.println("Non static block B");
    }


    public static void main(String[] args) {
        B b=new B();
    }

}
 Bu, bir sınıfın instance'ı (örneği) oluşturulduğunda çalışan bir "non-static" (statik olmayan) bloktur.

Bu blok, herhangi bir constructor (yapıcı) method çağrılmadan önce çalışır. Bu blok, özellikle instance değişkenlerinin (field) başlatılması veya kullanılması gibi işlemleri gerçekleştirmek için kullanılabilir.

Ayrıca, bu bloklar sınıfın içinde birden fazla kez tanımlanabilir ve instance oluşturulduğunda her biri sırasıyla çalıştırılır.

Örneğin, aşağıdaki kod parçasında "Non static block B" yazısı, her bir obje (instance) oluşturulduğunda yazdırılacaktır.
b objesi oluşturulmasa static blok dışındaki bloklar yazılmayacak.
Şu anki çıktısı şu şekilde:
static block A
static block B
Non static block A
Non static block B
[16:28, 24.02.2023] Hakan Kara: eğer main içinden  B b=new B(); silinirse sadece 2 static blok çalışıyor.
static block A
static block B yazdırıyor sadece.
*/