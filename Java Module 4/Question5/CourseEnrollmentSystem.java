import java.util.LinkedHashSet;
import java.util.Scanner;

class CourseEnrollment {
    LinkedHashSet<String> students = new LinkedHashSet<>();

    void enrollStudent(String name) {
        if (students.add(name)) {
            System.out.println(name + " enrolled successfully.");
        } else {
            System.out.println(name + " is already enrolled.");
        }
    }

    void displayEnrolledStudents() {
        System.out.println("Enrolled Students: " + students);
    }
}

public class CourseEnrollmentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseEnrollment course = new CourseEnrollment();

        System.out.print("Enroll: ");
        String name = sc.nextLine();
        course.enrollStudent(name);

        System.out.print("Enroll: ");
        name = sc.nextLine();
        course.enrollStudent(name);

        System.out.print("Enroll: ");
        name = sc.nextLine();
        course.enrollStudent(name);

        course.displayEnrolledStudents();
    }
}