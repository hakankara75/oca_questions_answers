package array;

import java.util.Arrays;

public class A4 {
    public static void main(String[] args) {
        int num [][]= new int[1][3];
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
num [i][j]=10;
                System.out.println(num[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(num));
    }
/* Which option represent the state of the num array after successful completion of the outer loop?
A
    num [0][0]=10;
    num [0][1]=10;
    num [0][2]=10;
B
    num [0][0]=10;
    num [1][0]=10;
    num [2][0]=10;
C
    num [0][0]=10;
    num [0][1]=0;
    num [0][2]=0;
D
    num [0][0]=10;
    num [0][1]=10;
    num [0][2]=10;
    num [0][3]=10;
    num [1][0]=0;
    num [1][1]=0;
    num [1][2]=0;
    num [1][3]=0;

    Cevap A:
    Cozum ilk for dongusu num.length kadar yani 1'e kadar calisacak. yani i=0 oldugundan bir kez calisir.
    ikinci for dongusu num[i].length kadar yani 3'e kadar calisacak. yani 3 kez calisacak.
    dolayisiyla ilk dongu 1 kez 2. dongu 3 kez calistigindan sadece num[0] elemanlari dolar.
    num[1] elemanlari deger alamaz.
 */
}
