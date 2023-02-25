package soru5;


public class B extends A{
    public String mA(){
        return "mB()";
    }

    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.mA());
    }

}