package classes;

public class C1 {
    public static void main(String[] args) {


        int n [][]={{1,3}, {2,4}};
        System.out.println(n.length);
        for (int i = n.length-1; i >=0 ; i--) {
            for (int y:n[i]){
                System.out.print(y);
            }
        }
    }
/*
What is the result?
A. 1324
B. 2313
C. 2413
D. 4231

Cevap: C
Cozum: ilk for dongusunde length-1=1 dir. yani i=1 dir.
icteki for dongusunda n[1] 2 ile 4 tur. dolayisiyla y once 2 sonra 4 yazdirir.
ilk for dongusune doner i 1 eksilir ve 0 olur. bu nedenle icteki for dongusunde
n[0] 1 ve 3 yazdirir. boylece 2413 cikar.

 */
}
