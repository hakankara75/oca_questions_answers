package constructor.C1;

public class Test {
        int x, y;

        public Test(int x, int y) {
            initialize(x, y);
        }

        public void initialize(int x, int y) {
            this.x = x * x;
            this.y = y * y;
        }

        public static void main(String[] args) {
            int x = 3, y =5;
            Test objTest = new Test(x, y);
            System.out.println(x + " " + y);

        }
    }
/*What is the result?
A.	Compilation fails.
B.	3 5
C.	0 0
D.	9 25

Cevap B
Cozum
main icinde x=3 y de 5 olarak atanmis. class icinde 2 tane parametreli const. olusturulmus.
main icinde bir obje olusturulmus. Ancak obje kullanilmamis. obje kullanilmadigi icin
2 const. da calismaz. dolayisiyla print x ve y yi ilk hallerinde yazdirir.

 */
