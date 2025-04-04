class Student {
    String name;
    int age;
    char grade;

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name);
        if (age != 0)
            System.out.println("Age: " + age);
        if (grade != '\u0000')
            System.out.println("Grade: " + grade);
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1 = new Student("Anjali");
        Student s2 = new Student("Ravi", 19);
        Student s3 = new Student("Sneha", 20, 'A');

        s1.display();
        s2.display();
        s3.display();
    }
}
