package variable.v1;

public class C {
    Check acct= new Check();
    public static void main(String[] args) {

        // line 2

    }
/*
Which three pieces of code, when inserted independently, set the value of amount to 100?
A.  at line 1 insert:
public Check(){
amount=100;
B.
at line 2 insert:
this.amount=100;
C. at line 2 insert:
 amount =100;
D. at line 1 insert:
public Check(){
this.amount=100;
E. at line 2 insert:
acct.amount=100;
F. at line 1 insert:
public Check(){
acct.amount=100;

Cevap: A    D   E
Cozum: a sikkinde kendi class indaki amount a 100 degeri veriyor. kendi class indaki amount oldugu icin this demese de olur.
b sikkinda amount a this demis. o class ta amount yok.
c sikki da b ile benzer sekilde. olmayan bir variable ilk kez tanimlanirken data type yazilmalidir. burda yazilmamis.
d sikkinda a sikkindaki gibi. fazladan this eklenmis. eklenmese de olurdu. class ta tek amount var.
e sikkinda amount variable obje ile cagirilmis. amount public oldugu icin cagirilabilir. burda da 100 degeri verilmis.
f sikkinda acct objesi cagrilmaya calisilmis. constructor olmadan cagirilamaz. o nedenle deger de veremez.
 */
}
