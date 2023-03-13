public class Deneme {

    static void quiz(int n){
        if (n==1)
        {
            return;
        }
        System.out.println(n+1);
        quiz(n-1);
        System.out.println(n+1);
    }
    public static void main(String[] args) {
        quiz(4);
        }
}
