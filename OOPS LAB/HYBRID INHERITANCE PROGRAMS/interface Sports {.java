interface Sports {
    void play();
}

class Person {
    void display() {
        System.out.println("I am a person.");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("I am working as an employee.");
    }
}

class Manager extends Employee implements Sports {
    public void play() {
        System.out.println("I play sports as a manager.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.display();
        manager.work();  
        manager.play();    
    }
}
