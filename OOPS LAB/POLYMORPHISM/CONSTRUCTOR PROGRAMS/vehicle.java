class Vehicle {
    Vehicle() {
        System.out.println("Car.");
    }

    Vehicle(String model) {
        System.out.println("Vehicle model: " + model);
    }

    Vehicle(String model, int year) {
        System.out.println("Vehicle model: " + model + ", Year: " + year);
    }
}

public class vehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        
        Vehicle v2 = new Vehicle("Toyota");
        
        Vehicle v3 = new Vehicle("Honda", 2022);
    }
}
