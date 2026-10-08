import java.util.Scanner;

class StudentMarks {
    void enterMarks(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            throw new Exception("Marks must be between 0 and 100");
        }
        System.out.println("Marks entered successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            StudentMarks s = new StudentMarks();
            s.enterMarks(marks);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you");
        }
    }
}