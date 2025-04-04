package Abstraction;

interface Transport {
    void bookRide(String source, String destination);
}

class Cab implements Transport {
    public void bookRide(String source, String destination) {
        System.out.println("Cab booked from " + source + " to " + destination + ".");
    }
}

class Auto implements Transport {
    public void bookRide(String source, String destination) {
        System.out.println("Auto booked from " + source + " to " + destination + ".");
    }
}

class Bike implements Transport {
    public void bookRide(String source, String destination) {
        System.out.println("Bike booked from " + source + " to " + destination + ".");
    }
}

public class TransportBooking {
    public static void main(String[] args) {
        Transport t1 = new Cab();
        Transport t2 = new Auto();
        Transport t3 = new Bike();

        t1.bookRide("Chennai Central", "T. Nagar");
        t2.bookRide("Guindy", "Velachery");
        t3.bookRide("Adyar", "Anna Nagar");
    }
}
