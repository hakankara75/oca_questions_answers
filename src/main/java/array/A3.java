package array;

public class A3 {
    public static void main(String[] args) {
        int numbers []= {12,13,42,32,15,156,23,51,12};
     //   int []keys=findMax(numbers);
    }
    //line 1
    int []keys= new int[3];
      //code goes here
 //   return keys;
}
/*Which method signature do you use at line n1?
        A. public int findMax (int[] numbers)
        B. static int[] findMax (int[] max)
        C. static int findMax (int[] numbers)
        D. final int findMax (int[]

Cevap: B
Cozum: main static oldugundan findMax metotu static olmak zorunda
return edecek olan keys array oldugundan return type da array olmak zorunda.

 */