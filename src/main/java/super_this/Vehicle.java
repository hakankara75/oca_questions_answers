package super_this;
    class Vehicle{
        int x;
        Vehicle(){
            this(10);
        }
        Vehicle(int x){
            this.x= x;
        }
    }
    class Car extends Vehicle{
        int y;
        Car(){
            super(10);
        }
        Car(int y){
            super(y);
            this.y =y;
        }
        public String toString() {
            return super.x + ":" + this.y;
        }
        public static void main(String[] args) {
            Vehicle y = new Car(20);
            System.out.println(y);
        }}
/*What is the result?
		 A.	Compilation fails at line n2.
		 B.	Compilation fails at line n1.
		 C.	20:20
		 D.	10:20

Cevap: C
Cozum: 	Main icinde y  Car(int y) const. gider ve super(y) calisir.
super(y) parametreli oldugu icin Vehicle da Vehicle(int x) const. calistirir ve x'i 20  olarak atanir.
Ordan geri Car classa doner. Car(int y) icindeki y'yi 20 olarak atar.
Main'e geri doner. print calisir. print de class icindeki toString metotunu calistirir
Boylece x ve y degerleri 20:20 seklinde yazilir.



 */
