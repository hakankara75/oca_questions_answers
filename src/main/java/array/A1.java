package array;

public class A1 {
    public static void main(String[] args) {


        int []arr1= {1,2,3};
        int []arr2=new int[5];
        arr2=arr1;
        for (int i:arr2){
            System.out.print(i+ " ");
        }

        int []arr3=new int[3];
        arr3=arr2;
        for (int i:arr3){
            System.out.print(i+ " ");
        }
    }

/*
What is the result?
A.1 2 3 0 0 1 2 3 0 0
B.1 2 3 null null 1 2 3 null null
C.An Exception is thrown at run time.
D.1  2 3 1 2 3

Cevap: D
Cozum: arr2=arr1; komutu ile arr2 arr1'e esitlenir. print de 1 2 3 olur.
arr3=arr2; komutu ile arr3 arr2'ye esitlenir. print de 1 2 3 olur.
 */
}
