import java.util.Scanner;

public class ArrayDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        try {
            int result = arr[index] / divisor;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds");
        }
    }
}