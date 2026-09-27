class Course {
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return courseName + " (" + duration + ")";
    }
}

class Student {
    String name;
    Course enrolledCourse;

    Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name +
               " Course: " + enrolledCourse;
    }
}

class PremiumStudent extends Student {
    int discount;

    PremiumStudent(String name, Course enrolledCourse, int discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + name +
               " Course: " + enrolledCourse +
               " Discount: " + discount + "%";
    }
}

public class Main {
    public static void main(String[] args) {

        // Course object
        Course course = new Course("Java", "3 months");

        // Normal student
        Student student = new Student("Arjun", course);

        // Premium student
        PremiumStudent premiumStudent =
                new PremiumStudent("Meena", course, 20);

        System.out.println(student);
        System.out.println(premiumStudent);
    }
}