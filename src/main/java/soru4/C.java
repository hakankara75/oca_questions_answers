package soru4;

public class C extends B{
    void p(){
        System.out.println("C");
    }

    void test(){

        C c=new C();

        c.p();
        super.p();
    }

    public static void main(String[] args) {
        C c=new C();
        c.test();

    }
}
