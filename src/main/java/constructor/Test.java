package constructor;

public class Test {

        int a1;
        public static void doProduct(int a) {
            a = a * a;

        }
        public static void doString(String s) {
            s.concat(" " + s);
        }
        public static void main(String[] args) {
            Test item = new Test();
            item.a1 = 11;
            String sb = "Hello";
            Integer i = 10;
            doProduct(i);
            doString(sb);
            doProduct(item.a1);
            System.out.println(i+ " " + sb + " " + item.a1);
        }

//What is the result?
//A.	10 Hello Hello 11
//B.	10 Hello Hello 121
//C.	100 Hello 121
//D.	100 Hello Hello 121
//E.	10 Hello 11
/*
Cevap E
Cozum metotlarin icinde print olmadigi icin veya birsey return etmedikleri icin bir sonuc cikarmazlar.
sadece en alttaki print calisip bir sonuc doner.
doProduct(int a) method'una gider sonuc = 100 doner ama consol da gorunmez cunku print komutu yok
doString(String s) method'una gider sonuc = Hello s  doner ama consol da gorunmez cunku print komutu yok
doProduct(int a) method'una gider sonuc = 121 doner ama consol da gorunmez cunku print komutu yok
 */
}
