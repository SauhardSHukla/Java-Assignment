import java.util.Scanner;

class MinimumAmountException extends Exception {
    MinimumAmountException(String message) {
        super(message);
    }
}

public class OnlineShopping {

    void placeOrder(int amount) throws MinimumAmountException {
        if (amount < 500) {
            throw new MinimumAmountException("Minimum cart value should be ₹500");
        }

        System.out.println("Order Placed Successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cart amount: ");
        int amount = sc.nextInt();

        OnlineShopping shop = new OnlineShopping();

        try {
            shop.placeOrder(amount);
        } catch (MinimumAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}