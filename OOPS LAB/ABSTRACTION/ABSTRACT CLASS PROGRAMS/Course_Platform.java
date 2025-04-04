abstract class Course {
    String title;

    Course(String title) {
        this.title = title;
    }

    abstract void showSyllabus();

    void enroll() {
        System.out.println("Enrolled in course: " + title);
    }
}

class JavaCourse extends Course {
    JavaCourse() {
        super("Java Programming");
    }

    @Override
    void showSyllabus() {
        System.out.println("Syllabus: OOP, Collections, Multithreading, JDBC");
    }
}

class WebDevCourse extends Course {
    WebDevCourse() {
        super("Web Development");
    }

    @Override
    void showSyllabus() {
        System.out.println("Syllabus: HTML, CSS, JavaScript, React");
    }
}

public class Course_Platform {
    public static void main(String[] args) {
        Course c1 = new JavaCourse();
        Course c2 = new WebDevCourse();

        c1.enroll();
        c1.showSyllabus();

        c2.enroll();
        c2.showSyllabus();
    }
}
