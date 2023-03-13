package concat;

public class C2 {
    public static void main(String[] args) {
        System.out.println("Result A "+ 0+1);
        System.out.println("Result B "+ (1)+(2));
    }
/*
What is the result?
A. Result A 01
    Result B 3
B. Result A 1
    Result B 12
C. Result A 1
    Result B 3
D. Result A 01
    Result B 12

Cevap D
Cozum: ilk printte string den sonra gelen 0 yanina 1 yazilir.
Cunku java string sonrasi int gelince concat yapacagini anlar.
dolayisiyla da rakamlari da concat yapar, arada + olmasina ragmen.
ikinci printde de ilk string sonra int geldigi icin yine concat yapar.
 */
}
