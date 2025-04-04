class AreaCalculator {
    double area(double radius) {
        return Math.PI * radius * radius; 
    }

    int area(int side) {
        return side * side;  
    }

    int area(int length, int breadth) {
        return length * breadth; 
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Area of Circle: " + ac.area(5.0));
        System.out.println("Area of Square: " + ac.area(4));
        System.out.println("Area of Rectangle: " + ac.area(4, 6));
    }
}
