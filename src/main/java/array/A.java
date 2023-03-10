package array;

public class A {
    public static void main(String[] args) {


    int nums1[]= {1,2,3};
    int nums2[]= {1,2,3,4,5};
    nums2=nums1;
    for (int x: nums2){
        System.out.print(x+ ":");
    }

}
/*
What is the result?
A. 1:2:3:4:5:
B. 1:2:3:
C. Compilation fails.
D. An ArrayOutOfBoundsException is thrown at runtime

Cevap: B
Cozum:   nums2=nums1 komutu ile num1 num 2 ye atanir. Boylece num2 nin ici degisir.
for dongusu calisinca num2 yi num1 icindeki degerlerle yazdirir.
 */
}