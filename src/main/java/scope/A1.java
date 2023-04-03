package scope;

public class A1 {
    public int amount;


    public static void main(String[] args) {
        A1 acc = new A1();
        // line n2
        System.out.println(acc.amount);
    }

        }
/*
	Which three pieces of code, when inserted independently, set the value of amount to 100?
 	A. At line n1 insert:
 		public void ceckingAccount(){
 		amount = 100;
 		}
 	 B. At line n2 insert:
 		this.amount = 100;
 	 C. At line n2 insert:
 		amount = 100;
 	 D. At line n1 insert:
 		public void ceckingAccount(){
 		this.amount = 100; // bu da tek basina yazilsa 100 yazdirir
 		}
 	 E. At line n2 insert:
 		acc.amount = 100;
 	 F. At line n1 insert:
 		public CheckingAccount(){
 		acc.amount = 100; // acc asagida atanmis o yuzden yukaridan ulasilamaz

Cevap E
Cozum: A sikkinda main icinde ceckingAccount() cagirilmadigi icin 100 yazdirmaz. metot sadece amount'a 100 degeri atiyor.
B sikkinda this kullanilamaz. main static oldugundan amount bu skop disindari. this ile ona ulasamayiz.
C sikkinda B ile benzer. amount'un static olmasi gerekir.
D sikkinda main icinde ceckingAccount() cagirilmadigi icin 100 yazdirmaz. metot sadece amount'a 100 degeri atiyor.
E sikkinda obje ile static olmayan amount cagrilip 100 atanmis. cikti 100 olur.
F sikkinda main icindeki obje kullanilmaya calisilmis. skop disi oldugu icin kullanilamaz.
 */