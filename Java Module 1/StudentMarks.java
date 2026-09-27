import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        // Read marks of 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Print marks of each student
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    }
}
