class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
interface Electric {
    void charge();
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}
class ElectricCar extends Car implements Electric {
    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}
public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.drive();
        tesla.charge();
    }
}
