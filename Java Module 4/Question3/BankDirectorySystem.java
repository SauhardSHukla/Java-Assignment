import java.util.HashMap;
import java.util.Scanner;

class BankDirectory {
    HashMap<Integer, String> accounts = new HashMap<>();

    void addAccount(int accountNo, String name) {
        accounts.put(accountNo, name);
        System.out.println("Account added successfully.");
    }

    void getCustomer(int accountNo) {
        if (accounts.containsKey(accountNo)) {
            System.out.println("Account No: " + accountNo + " → " + accounts.get(accountNo));
        } else {
            System.out.println("Account not found.");
        }
    }

    void displayAll() {
        System.out.println("All Accounts: " + accounts);
    }
}

public class BankDirectorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDirectory bank = new BankDirectory();

        while (true) {
            System.out.println("\n1. Add Account");
            System.out.println("2. Get Customer Name");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int accountNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    bank.addAccount(accountNo, name);
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    accountNo = sc.nextInt();
                    bank.getCustomer(accountNo);
                    break;

                case 3:
                    bank.displayAll();
                    break;

                case 4:
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}