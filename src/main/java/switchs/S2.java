package switchs;

public class S2 {
    public static void main(String[] args) {

        final char a= 'A', d='D';
        char grada='B';

        switch (grada){
            case a:
            case 'B':
                System.out.print("great");
                case 'C':
                    System.out.print("good"); break;
            case d:
            case 'F':  System.out.print("not good");
        }

    }
    /*
    Kod blokunun ciktisi nedir?
    A- not good
    B- good
    C- greatgood
    D great

    Cevap:
    greatgood
    Cunku grada='B' dir. o zaman case 'B' calisir. sonra break gelmediginden  case 'C' de calisir.
    iki case'in printi System.out.print komutu oldugundan ciktilar bitisik olur.
     */
}
