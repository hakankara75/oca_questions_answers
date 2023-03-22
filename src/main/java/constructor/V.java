package constructor;

public class V {

        V(){
            System.out.println("Vehicle");
        }
    }
    class Bus extends V{
        Bus(){
            System.out.println("Bus");
        }
    }
     class Transport {
        public static void main(String[] args) {
            V v = new Bus();
        }
    }
//What is the result?
//A.	Vehicle
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
/*
Cevap A
Cozum
 V v = new Bus();  Bus() const. gider
Bus() const. super vardır. V extend oldugu icin ona gider.
V() const. calisir Vehicle yazdiri.
Child a doner Bus() const. calisir Bus yazdirir.
 */
