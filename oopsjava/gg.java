class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is running");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is racing");
    }
}

public class gg{
    public static void main(String[] args){
        Vehicle v;

        v = new Car();  // what will print?
        v.move();

        v = new Bike(); // what will print?
        v.move();

    }
}
