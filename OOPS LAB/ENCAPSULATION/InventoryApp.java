package Encapsulation;

class Product {
    private String name;
    private int stock;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void updateStock(int sold) {
        if (sold <= stock) {
            stock -= sold;
        } else {
            System.out.println("Not enough stock available.");
        }
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Available Stock: " + stock);
        System.out.println("Price: ₹" + price);
    }
}

public class InventoryApp {
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("Laptop");
        p.setStock(10);
        p.setPrice(55000);

        p.displayProduct();
        p.updateStock(3);  // 3 sold
        p.displayProduct();
    }
}