package switchs;
public class S1 {
    public static void main(String[] args) {

//        boolean opt=true;
//        switch (opt){
//            case true:
//                System.out.println("True");
//                break;
//            default:
//                System.out.println("***");
//        }
//        System.out.println("Done");
    }
/* Which modification enables the code fragment to print True Done?
    A. Replace line 5 With String opt = "true"; Replace line 7 with case "true":
    B. Replace line 5 with boolean opt = 1; Replace line 7 with case 1:
    C. At line 9, remove the break statement.
    D. Remove the default section.

Cevap A
Cozum String opt = "true"; olursa case deki true nun da string olmasi gerekir. case "true": olursa calisir.
B sikkinda boolean opt = 1; CTE verir. booleanlar sadece false ve true degeri alir.
C sikkinda break kaldirilirsa default altindaki System.out.println("***"); calisir.
D sikkinda default kaldirilirsa RTE verir.
*/
}
