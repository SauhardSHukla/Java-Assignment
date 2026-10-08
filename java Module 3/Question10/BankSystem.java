import java.util.Scanner;

class BankTransaction extends Thread {
    int amount;

    BankTransaction(int amount, String name, int priority) {
        super(name);
        this.amount = amount;
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() + " processed: ₹" + amount
                + " | Priority: " + getPriority());
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Transaction1: ₹");
        int amount1 = sc.nextInt();

        System.out.print("Transaction2: ₹");
        int amount2 = sc.nextInt();

        BankTransaction t1 = new BankTransaction(
                amount1, "Transaction1", Thread.MIN_PRIORITY);

        BankTransaction t2 = new BankTransaction(
                amount2, "Transaction2", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}