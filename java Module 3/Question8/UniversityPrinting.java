import java.util.Scanner;

class PrinterJob implements Runnable {
    int job;
    String student;

    PrinterJob(int job, String student) {
        this.job = job;
        this.student = student;
    }

    public void run() {
        try {
            System.out.println("Printing job " + job + " by " + student);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Printing interrupted");
        }
    }
}

public class UniversityPrinting {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of print jobs: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String student = "Student " + (char)('A' + i - 1);

            Thread t = new Thread(new PrinterJob(i, student));
            t.start();
            t.join();
        }
    }
}