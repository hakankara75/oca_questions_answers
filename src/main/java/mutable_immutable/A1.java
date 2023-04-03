package mutable_immutable;

public class A1 {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3};
        int nums2[] = {1, 2, 3, 4, 5};
        nums2 = nums1;
        for (int x : nums2) { // 1: 2: 3:
            System.out.print(x + ": ");
        }
    }
}
/*
What is the result?
A. 1:2:3:4:5:
B.	1:2:3:
C.	Compilation fails.
D.	An ArrayOutOfBoundsException is thrown at runtime.
B answer


Cevap: B
Cozum: Arrayler immutable dir. yapilan atamalarda referans degisir, kutu degismez.
nums2 = nums1; kodu ile nums2 kutusu korunurken referansi degisir. nums1'in referansi kullanilir.
boylece 3 elemanli nums2 yazdirilir.
 */

