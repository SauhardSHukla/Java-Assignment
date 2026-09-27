class Account {
    private String accNo;
    private String holderName;
    private double balance;

    Account(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        Account account = new Account("ACC101", "John", 0);

        account.deposit(1000);
        account.withdraw(500);

        System.out.println("Balance: " + account.getBalance());
    }
}