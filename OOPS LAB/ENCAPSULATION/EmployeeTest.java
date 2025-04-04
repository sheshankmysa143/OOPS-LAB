package Encapsulation;

class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Minimum salary should be ₹10,000");
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Harsha");
        emp.setSalary(9000);  

        emp.setSalary(15000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: ₹" + emp.getSalary());
    }
}