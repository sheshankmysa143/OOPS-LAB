class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
    }
}
