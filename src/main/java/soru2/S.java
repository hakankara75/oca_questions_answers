package soru2;

import java.util.Arrays;

public class S {

        public static void main(String[] args) {
            String [][]chs= new String[2][];
            chs[0]= new String[2];
            chs[1]= new String[5];
            int i=97;

            for (int a = 0; a < chs.length; a++) {
                for (int b = 0; b < chs.length; b++) {
                    chs[a][b]=""+i;
                    i++;
                    System.out.println(Arrays.deepToString(chs));
                }
            }
            for (String []ca:chs){
                for (String c:ca){
                    System.out.print(c+" ");
                }
                System.out.println();
            }
        }
    }
/*
What is the result?
Main.A. 97 98
99 100 null null null
B. 97 98
99 100 101 102 103
C. Compilation fails.
D. Main.A NullPointerException is thrown at runtime.
E. An ArrayIndexOutOfBoundaException is thrown at runtime.
Cozum:
12. satirda chs.length 2 oldugundan 2 defa calisir
13. satirda chs.length 2 oldugundan ilk seferde chs[0]i 97 98 olarak doldurur.
2.defa da chs[1] i 99 100 yapar. length bittiginden son 3 kutu null olur.
19. satirda chs ca arrayine aktarilir.
20. satirda ca arrayi c stringine aktarilir.
21. satirda da for 1. donuste chs 2 oldugundan 2 defa donderir arada bir bosluk birakip 97 98 yazdirir
23. satirda println bir alt satira atar
19. for dongusu birdaha calisir
21. satirda 99 100 ve null null null yazirir.
 */
