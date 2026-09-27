abstract class Loan {
    double principal;
    double rate;
    double time;

    Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    abstract double calculateInterest();
}

class HomeLoan extends Loan {

    HomeLoan(double principal, double time) {
        super(principal, 8, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {

    CarLoan(double principal, double time) {
        super(principal, 10, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Main {
    public static void main(String[] args) {

        String input1 = "Home,500000,8";
        String input2 = "Car,300000,5";

        String[] data1 = input1.split(",");
        String[] data2 = input2.split(",");

        Loan homeLoan = new HomeLoan(
            Double.parseDouble(data1[1]),
            Double.parseDouble(data1[2])
        );

        Loan carLoan = new CarLoan(
            Double.parseDouble(data2[1]),
            Double.parseDouble(data2[2])
        );

        System.out.println("Home Loan Interest: " +
                homeLoan.calculateInterest());

        System.out.println("Car Loan Interest: " +
                carLoan.calculateInterest());
    }
}