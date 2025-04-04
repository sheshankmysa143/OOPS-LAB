class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void getDiscountedPrice() {
        System.out.println(name + " - No discount. Final Price: ₹" + price);
    }
}

class Electronics extends Product {

    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    void getDiscountedPrice() {
        double discount = 0.10 * price;
        double finalPrice = price - discount;
        System.out.println(name + " (Electronics) - Final Price after 10% discount: ₹" + finalPrice);
    }
}

class Clothing extends Product {

    Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    void getDiscountedPrice() {
        double discount = 0.20 * price;
        double finalPrice = price - discount;
        System.out.println(name + " (Clothing) - Final Price after 20% discount: ₹" + finalPrice);
    }
}

public class ShoppingTest {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 50000);
        Product p2 = new Clothing("T-Shirt", 1000);
        Product p3 = new Product("Book", 500);

        p1.getDiscountedPrice();
        p2.getDiscountedPrice();
        p3.getDiscountedPrice();
    }
}
