class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 50000, 10000);
        mgr.display();
    }
}
