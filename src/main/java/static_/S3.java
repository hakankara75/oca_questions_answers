package static_;

public class S3 {
    int i;
    static int j;

    public static void main(String[] args) {
        S3 obj=new S3();
        S3 obj21123=new S3();
        obj.i=3;
        obj21123.i=4;
        obj.j=4;
        obj21123.j=5;
        System.out.println(obj.i+" "+
                            obj21123.i+" "+
                            obj.j+" "+
                            obj21123.j);
    }
/*
What is the outpur?
A.3 4 4 5
B.3 4 5 4
C.3 3 5 5
D.3 4 5 5

Cevap D
Cozum:
i instance variable dir. obj once i yi 3 yapar ciktisi 3 olur, sonra da obj21123 i yi 4 yapar ciktisi 4 olur.
instance objeye gore degistigi icin iki farkli sonuc cikar.
j static variable dir. obj once j yi 4 yapar , sonra da obj21123 j yi 5 yapar.
static herkes icin aynı oldugundan en son 5 atandigi icin iki objenin ciktisi da 5 olur.
 */
}
