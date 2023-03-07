package super_this.s3;

public class Car extends Vehicle{
    String trans;

    Car (String trans){ //line 1
        this.trans=trans;
    }
    public Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed); //line 2
        this.trans = trans;
    }

    public static void main(String[] args) {
        Car c1=new Car("Auto");
        Car c2=new Car("4W", 150, "Manual");
        System.out.println(c1.type+ " "+ c1.maxSpeed+ " "+ c1.trans);
        System.out.println(c2.type+ " "+ c2.maxSpeed+ " "+ c2.trans);

    }
/*
What is the result?
A. 4W 100 Auto
    4W 150 Manual
B. null 0 Auto
    4W 150 Manual
C. Compilation fails only at line 1
D. Compilation fails only at line 2
E. Compilation fails only at line 1 and line 2

Cevap A
Cozum: Auto parametreli c1 calisir. Tek parametreli Car constructor a gider. i2 variable bulamayinca
oradan Vehicle class a cikar. Vehicle class ta en ustteki type ve maxSpeed variable larini okur, geri doner. Boylece
4W 100 Auto yazdirir. c2 ise icindeki 3 parametreyi de yazdirir.

 */

}
