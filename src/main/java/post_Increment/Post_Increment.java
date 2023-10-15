package post_Increment;

public class Post_Increment {
    public static void main(String[] args) {
        int num1=9;
        int num2=num1++;

        if(num2 < 10){
            System.out.println("Hello World = " + num2);
        }else{
            System.out.println("Hello Universel = " + num1);
        }

    }
    /*
    Yukarıdaki soruda num1=9 verildiginde cikti ne olur?
    A- Cikti olmaz
    B- Hello World = 10
    C- Hello World = 9
    C- Hello Universel 9
    D- Hello Universel 10

    Cevap: Hello World = 9
    Cunku num1++ demek java soldan okumaya basladigindan 9'dur. Bu 9 num2'ye atanir, sonra da rakam 1 artar.
    Ama artirim atamadan sonra oldugu icin sonuc degismez.
    num2 10'dan kucuk oldugu icin if blokunda ilk blok calisir.
     */
}
