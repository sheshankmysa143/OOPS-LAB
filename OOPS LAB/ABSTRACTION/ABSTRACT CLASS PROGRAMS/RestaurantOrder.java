package Abstraction;

interface FoodItem {
    void prepare();
}

class Pizza implements FoodItem {
    public void prepare() {
        System.out.println("Preparing Pizza with cheese and toppings...");
    }
}

class Burger implements FoodItem {
    public void prepare() {
        System.out.println("Preparing Burger with patty and veggies...");
    }
}

class Sandwich implements FoodItem {
    public void prepare() {
        System.out.println("Preparing Sandwich with bread and fillings...");
    }
}

public class RestaurantOrder {
    public static void main(String[] args) {
        FoodItem order1 = new Pizza();
        FoodItem order2 = new Burger();
        FoodItem order3 = new Sandwich();

        order1.prepare();
        order2.prepare();
        order3.prepare();
    }
}
