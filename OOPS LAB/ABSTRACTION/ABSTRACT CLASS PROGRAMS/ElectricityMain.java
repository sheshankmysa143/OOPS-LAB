

abstract class ElectricityBill {
    String customerName;
    int units;

    ElectricityBill(String customerName, int units) {
        this.customerName = customerName;
        this.units = units;
    }

    abstract double calculateBill();

    void printBill() {
        System.out.println(customerName + "'s Bill Amount: ₹" + calculateBill());
    }
}

class DomesticConnection extends ElectricityBill {
    DomesticConnection(String customerName, int units) {
        super(customerName, units);
    }

    @Override
    double calculateBill() {
        return units * 3.5; 
    }
}

class CommercialConnection extends ElectricityBill {
    CommercialConnection(String customerName, int units) {
        super(customerName, units);
    }

    @Override
    double calculateBill() {
        return units * 7.0;
    }
}

public class ElectricityMain {
    public static void main(String[] args) {
        ElectricityBill d = new DomesticConnection("Sheshank", 100);
        ElectricityBill c = new CommercialConnection("Amrita Labs", 150);

        d.printBill();
        c.printBill();
    }
}