package do_while;

public class S1 {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        /* line 1 */
        System.out.print("The top element: " + stack[idx]);
    }
            /*
Which code fragment, inserted at line n1, prints the top element:30?
A
    do{
    idx++;
    }while(idx>=size);
B
     while(idx<size){
     idx++;
     }
C
    do{
    idx++;
    }while(idx<size-1);
D
     do{
    idx++;
    }while(idx<=size);
E
    while(idx<=size-1){
     idx++;
     }
Cozum
Cevap C sikki. ilk etapta idx do icinde 1 olur. size-1=2 oldugundan 2. tura doner. sonra idx 2 olur   size-1=2 oldugundan
kucuk degildir. do dongusu kirilir. idx 2 oldugu icin stack[2] olur. o da 30 dur.
             */
}
