class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area(double radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    void area(double length, double breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area(5);

        Rectangle r = new Rectangle();
        r.display();
        r.area(4, 6);
    }
}
