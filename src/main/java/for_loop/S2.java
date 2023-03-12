package for_loop;

public class S2 {
    public static void main(String[] args) {
        String [] arr= {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            if (arr[i].equals("C")){
                continue;
            }
            System.out.println("Work done");
            break;
        }
    }
/*
What is the result?
A. A B C Work done
B. A B C D Work done
C. A Work done
D. Compilation fails

Cevap C
Cozum: for dongusu i==0 da calisir. arr[0] dan A yi yazdirir. if sarti olusmaz, asagi iner ve
print icindeki "Work done" yazdirir. sonra break gorunce programi sonlandirir.
 */
}
