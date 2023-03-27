package try_catch;

public class T1 {
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                idx++;
            }
        } catch (Exception e) {
            System.out.println("Invalid Name");
        }
        for (String p : pwd) {
            System.out.println(p);
        }
    }

    /*
    What is the output?
A.
    omas
    null
    null
    Invalid Name
B.
    CTE
C.
    Invalid Name
    omas
    null
    null
D.
    omas
    eter
    osep

    Cevap: C
    Cozum:
String n : names
ile elemanları tek tek n kutusuna atar.  pwd[idx] = n.substring(2, 6); komutu ile n'yi yani her bir elemanın 2.harfi ile 6. harfi
 arasını pwd arrayine atar. ilk eleman Thomas dır. Thomas'ın substring(2,6) sı index 0 dan başlayıp sayınca "omas" olur.
 bunu pwd arrayine kaydeder. 2. eleman Peter for dongusune girer. ancak indexi 6 dan küçük olduğundan hata verir.
 en başta pwd 3 elemanlı oluşturulduğundan boşta kalan 2 elemanı null olarak kalır.
 dolayısıyla catch bloğu çalışır. ilk for dongusunde print olmadigi icin birsey yazdirmaz. for dongusunden çıkılır.
 catch bloku calisir. print komutu "Invalid Name" yazdirir. ardindan alttaki for dongusu calisir.
o da print ile elemanları yazdırır.
     */
}
