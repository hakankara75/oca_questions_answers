package for_loop;

public class S3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10;
             i= i++) {
            System.out.println(i + "Hello World");

        }
    }
    /*
    Kod blogu kac tane "Hello World" yazdirir.
    A. 9
    B. 10
    C. 11
    D. 4.satirdan dolayi kod calismaz.
    E. 8.satirdan dolayi kod calismaz.
    F. Kod sonsuz bir donguye girer.

Cevap: F
Cozum: Fori icinde i artirim komutu i=i++ olarak yazilmistir. Java soldan saga okur.
Dolayisiyla i her zaman i'dir yani 0 dir. Once atama var sonra Post increment.
++ islemi bu atamadan sonra oldugu icin i hic artmaz ve sonsuz donguye girer.
     */
}
