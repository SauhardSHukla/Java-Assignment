import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        boolean citizenship = sc.nextBoolean();

        boolean eligible = (age >= 18) && citizenship;

        if (eligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}
