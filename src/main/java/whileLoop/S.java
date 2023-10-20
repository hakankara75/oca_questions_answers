package whileLoop;

public class S {
    public static void main(String[] args) {
        int x = 0;
        while ((x++ < 10)) {
        }
        String message = x > 10 ? "Greater than" : false;
        System.out.println(message + "," + x);
    }

    /*
    Yukaridaki kodun sonucu nedir?
    A. Grater than,10
    B. false,10
    C.Greter than,11
    D. false,11
    E. 6. satirdan dolayi calismaz
    F. 7. satirdan dolayi calismaz

    Cevap F
    Cozum String message icine bir turney kurulmus. Turney dogru ise sonuc "Greater than" olacak.
    Ama turnery yanlis ise sonuc false olacak. False sonucunu ancak boolean tipi bir variable alabilir.
    Dolayisiyla stringe boolean atanamayacagindan CTE verir.
     */
}
