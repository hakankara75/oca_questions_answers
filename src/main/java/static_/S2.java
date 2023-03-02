package static_;

public class S2 {
    public static void main(String[] args) {
        int var1=200;
        System.out.print(doCalc(var1));
        System.out.print(" "+ var1);

    }

    static int doCalc(int var1){
        var1=var1*2;
        return var1;
    }
    /*
    What is the result?
    A. 400 200
    B. 200 200
    C. 400 400
    D. Compilation fails

    Cevap A
    Cozum: sout icindeki doCalc calisir. var1 i 200 olarak okuyup 2 ile carpar, 400 yazdirir.
    alt satirdaki sour calisip instance variable var1'i 200 olarak yazdirir.
     */
}
