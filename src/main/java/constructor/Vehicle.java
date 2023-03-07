package constructor;

public class Vehicle {
    int x;
    Vehicle(){
        this(10); //line 1
    }

    Vehicle(int x){
        this.x=x;
    }
}
