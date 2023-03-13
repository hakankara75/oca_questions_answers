package array;

public class A2 {
    public static void main(String[] args) {
        int data [] = {2010, 2013, 2014, 2015, 2014};
        int key=2014;
        int count=0;
        for (int e: data){
            if (e !=key){
                continue;
                //   count++;
            }
        }
        System.out.println(count+ " found");
    }
/*
What is the result?
A. Compilation fails.
B. 0 Found
C. 1 Found
D. 3 Found

Cevap:  A
Cozum:  continue; dan sonra komut gelmez. gelen komut cte veri. break; de ayni sekilde son komuttur.
ondan sonra da komut gelmez.

 */
}
