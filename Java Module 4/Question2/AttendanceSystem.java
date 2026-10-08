import java.util.HashSet;
import java.util.Scanner;

class Attendance {
    HashSet<String> students = new HashSet<>();

    void markAttendance(String name) {
        if (students.add(name)) {
            System.out.println("Attendance marked for " + name);
        } else {
            System.out.println(name + " is already marked present.");
        }
    }

    void displayAttendance() {
        System.out.println("Attendance: " + students);
    }
}

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Attendance attendance = new Attendance();

        System.out.print("Enter name to mark attendance: ");
        String name = sc.nextLine();
        attendance.markAttendance(name);

        System.out.print("Enter name to mark attendance: ");
        name = sc.nextLine();
        attendance.markAttendance(name);

        attendance.displayAttendance();
    }
}