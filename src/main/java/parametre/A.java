package parametre;

public class A {
    public static void doSum(Integer x, Integer y) {
        System.out.println("Integer sum is " + (x + y.intValue()) );
    }
    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }
    public static void doSum(float x, float y) {
        System.out.println("float sum is " + (x + y) ) ;
    }
    public static void main(String[] args) {
        doSum(10, 20) ;
        doSum(10.0, 20.0);
    }
/* Çıktı nedir?
Sonuç:
float sum is 30.0
double sum is 30.0

parametreler int ve double olarak girilmiş. yani primitive. doSum larda sadece Integer wrapper class.
dolayısıyla primitive data primitive variable gitti. Integer bir class ve object sınıfına dahil.
classlar da da objectler metot çağırarak iş yapar.
Burada x ve y Integer classindan 2 object, onlara metot lazım. add, sum, plus ... vb.

 */
}
