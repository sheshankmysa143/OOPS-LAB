abstract class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    abstract String getGrade();

    void display() {
        System.out.println(name + " scored " + marks + " and got grade: " + getGrade());
    }
}

class UGStudent extends Student {
    UGStudent(String name, int marks) {
        super(name, marks);
    }

    @Override
    String getGrade() {
        return marks >= 50 ? "Pass" : "Fail";
    }
}

class PGStudent extends Student {
    PGStudent(String name, int marks) {
        super(name, marks);
    }

    @Override
    String getGrade() {
        return marks >= 60 ? "Pass" : "Fail";
    }
}

public class GradeSystem {
    public static void main(String[] args) {
        Student ug = new UGStudent("Sheshank", 55);
        Student pg = new PGStudent("Harsha", 55);

        ug.display();
        pg.display();
    }
}
