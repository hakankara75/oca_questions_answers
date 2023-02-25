package soru1;

public class Soru2 {
    public static void main(String[] args) {

        int ans;

        try {
            int num=10;
            int div=0;
            ans= num/div;
        }catch (ArithmeticException ae){
            ans=0;
        }catch (Exception e){
            System.out.println("Invalid calculation");
        }
        //  System.out.println("Answer "+ ans);

        int c;
        do {
            c=1;
        }while (c!=0);
    }
}
