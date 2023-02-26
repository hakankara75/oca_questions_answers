package soru1;

public class Soru10 {
    public static void main(String[] args) {
        int []stack={10,20,30};
        int size=3;
        int idx=0;
        /* line 1 */
        System.out.print("The top element: "+ stack[idx]);
    }
    /*
    Which code fragment, inserted at line 1, prints The top element: 30 ?
    A
    do{
    idx++;
    }while (idx >=size);

    B
    do{
    idx++;
    }while (idx <size);

    C
    do{
    idx++;
    }while (idx <size-1);

    D
    do{
    idx++;
    }while (idx <=size);

    E
   while (idx >=size){
   };

   Cozum:  stack[idx] 0 ile baslar. Parantez icinde idx 1 olur ve parantez disina cikar. idx=1<size-1 oldugundan
   dongu devam eder. idx 1 iken parantez icinde 1 artar yani 2 olur. idx=2 while dongusunden size-1 den kucuk olmadigindan
   dongu biter. print yazdirir. idx=2 oldugundan stack in 0. elemani 10, 1. elemani 20, 2. elemani 30 dur.
   C sikki dogrudur.
     */
}
