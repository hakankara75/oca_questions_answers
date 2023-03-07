package map.hashmap;

import java.util.HashMap;

public class A {
    public static void main(String[] args) {
        HashMap<String , String > sozluk= new HashMap<String , String >();
    sozluk.put("book", "kitap");
    sozluk.put("table", "masa");
    sozluk.put("computer", "bilgisayar");

        System.out.println(sozluk.size());

        System.out.println(sozluk); //{computer=bilgisayar, book=kitap, table=masa}
        System.out.println(sozluk.keySet()); //[computer, book, table]
        System.out.println(sozluk.entrySet()); //[computer=bilgisayar, book=kitap, table=masa]
        for (String item: sozluk.keySet()){
            System.out.print("Eleman: "+item+" Deger: "+item);//Eleman: computer Deger: computerEleman: book Deger: bookEleman: table Deger: table
        }



    }


}
