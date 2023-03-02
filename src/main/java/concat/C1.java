package concat;

public class C1 {
    public static void main(String[] args) {
        String [] strs= {"A", "B"};
        int idx=0;
        for (String s:strs){
            strs[idx].concat(" element "+ idx);
            idx++;

        }
        for (idx=0; idx<strs.length; idx++){
            System.out.println(strs[idx]);
        }
    }
    /*
    What is the result?
    A. A
       B
    B. A element 0
       B element 1
    C. A NullPointerException is thrown at runtime
    D. A 0
       B 1

 Cevap A sikki.
 Cozum: ilk for dongusu calisir ancak strs[idx]'e yapilan concat bir variable atama yapilmadigindan birsey degismez.
 ikinci dongu idxidx<strs.length oldugundan calismaz.  Cunku length 1 oldugundan idx 0 da kalir ve calismaz.
 Dolayisiyla strs[idx] yapisini korumus olur.

     */
}
