import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void registerStudent(int age) throws InvalidAgeException {
        if (age < 17) {
            throw new InvalidAgeException("Age must be 17 or above");
        }
        System.out.println("Student Registered Successfully");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Student student = new Student(name);

        try {
            student.registerStudent(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}