package super_this.s2;

public class Test {
    int x, y;

    public Test(int x, int y) {
        initialize(x,y);
    }

    public void initialize(int x, int y) {
       this.x=x*x;
       this.y=y*y;
    }

    public static void main(String[] args) {
        int x=3, y=5;
        Test obj=new Test(x, y);
        System.out.println(x+ " "+ y);
    }
/*
What is the result?
A. Compilation fails.
B. 3 5
C. 0 0
D. 9 25

Cevap 3 5
Cozum: main icinde obj parametresi  calisinca Test constructor a gider. orada initialize metota yollar.
initialize metot parametreleri 3 ve 5 olarak x ve y ye deger verir. metot icinde x 9, y 25 olur. metot tekrar
Test constructor a donerken ilk parametre degerlerini 3 ve 5 i geri donderir. initialize metot ici 3 ve 5 olup
main icine doner. boylece sout ici calisir ve 3 5 yazdirir.
 */

}
