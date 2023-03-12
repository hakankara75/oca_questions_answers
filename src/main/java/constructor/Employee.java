package constructor;

public class Employee {
    String name;
    boolean contract;
    double salary;
    Employee(){
        // line 1
    }

    public String toString(){
        return name+ ": "+ contract+": "+salary;
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        //line 2
        System.out.println(e);
    }
/*
Which two modifications, when made independentyl, enable the code to print Joe: true+ 100.0? (Choose two)
A. Replace line 2 with:
e.name="Joe";
e.contract=true;
e.salary=100;

B. Replace line 2 with:
this.name="Joe";
this.contract=true;
this.salary=100;

C. Replace line 1 with:
this.name= new String ("Joe");
this.contract= new Boolean (true);
this.salary= new Double (100);

D. Replace line 1 with:
name="Joe";
contract=TRUE;
salary=100.0f;

E. Replace line 1 with:
this("Joe", true, 100);

Cevap A ve C
Cozum: line 1 de ust tarafta tanimlanan ancak deger atanmayan variable lara deger atanmasi gerekir.
C sikkinda degerler atanarak initialize edilmis.
line 1'e deger atayabilecek diger sik D'dir. Ancak onda TRUE variable atanmis fakat class ustunde TRUE cagirilmamis.
CTE verir. TRUE cagirilirsa o da olurdu.
line 1'e deger atayabilecek son sik E'dir. Ancak onun kullanabilecegi parametreli Employee(String name, boolean contract
double salary) olmasi gerekirdi. Olmadigindan bu da kullanilamaz.

line 2'ye ise B sikki olmaz. Cunku e objesi ile cagirilmasi gerekirken this ile cagirilmis. CTE verir.
 */

}
