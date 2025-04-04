class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void display() {
        super.display();
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
        Manager mgr = new Manager("John", 60000, 10000);
        mgr.display();
    }
}
