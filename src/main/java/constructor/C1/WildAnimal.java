package constructor.C1;

public class WildAnimal  extends Animal{
    String bounds;
    WildAnimal (String bounds){
        // line 1
    }

    WildAnimal (String type, int maxSpeed, String bounds){
        //line 2
    }

    public static void main(String[] args) {
        WildAnimal wolf=new WildAnimal("Long");
        WildAnimal tiger=new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type+ " "+ wolf.maxSpeed+ " "+ wolf.bounds);
        System.out.println(tiger.type+ " "+ tiger.maxSpeed+ " "+ tiger.bounds);
    }
/*
and this output:
Canine 60 Long
Feline 80 Short
Which two modifications enable the code to print this output? (Choose two.)
A. Replace line 1 with:
super();
  this.bounds=bounds;
B. Replace line 1 with:
  this.bounds=bounds;
  super();  = = > super her zaman constructor dan sonra ilk satirda gelir. yoksa cte verir.
C. Replace line 2 with:
super(type, maxSpeed);
  this(bounds); ==> bounds variable na deger atanmadigi icin cte verir.
D. Replace line 1 with:
this("Canine", 60); = = > bu sekilde CTE verir. Cunku bunun constructoru yok.
  this.bounds=bounds;
E.  Replace line 2 with:
super(type, maxSpeed);
  this.bounds=bounds;
 */

}
