package variable;

public class V1 {
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum is "+ (x+y));
    }
    public static void doSum(double x, double y){
        System.out.println("double sum is "+ (x+y));
    }
    public static void doSum(float x, float y){
        System.out.println("float sum is "+ (x+y));
    }
    public static void doSum(int x, int y){
        System.out.println("int sum is "+ (x+y));
    }

    public static void main(String[] args) {
        doSum(10, 20);
//       doSum(10.0, 20,0);
    }

/*
What is the result?
A.
int sum is 30
float sum is 30.0
B.
int sum is 30
double sum is 30
C.
Integer sum is 30
double sum is 30
D.
Integer sum is 30
float sum is 30

Cevap C sikki
Cozum

 */
}
