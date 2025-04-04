package Abstraction;

abstract class Order {
    String product;

    Order(String product) {
        this.product = product;
    }

    abstract void calculateShipping();

    void confirmOrder() {
        System.out.println("Order placed for: " + product);
    }
}

class LocalOrder extends Order {
    LocalOrder(String product) {
        super(product);
    }

    @Override
    void calculateShipping() {
        System.out.println("Shipping charges: ₹50 (Local delivery)");
    }
}

class InternationalOrder extends Order {
    InternationalOrder(String product) {
        super(product);
    }

    @Override
    void calculateShipping() {
        System.out.println("Shipping charges: ₹500 (International delivery)");
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        Order o1 = new LocalOrder("Book");
        Order o2 = new InternationalOrder("Laptop");

        o1.confirmOrder();
        o1.calculateShipping();

        o2.confirmOrder();
        o2.calculateShipping();
    }
}
