
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {

    private String productName;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity + " = " + (price * quantity);
    }
}

class Order {

    private String orderId;
    private List<Product> products;

    public Order() {
        products = new ArrayList<>();
    }

    public Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }

        return total;
    }

    @Override
    public String toString() {
        String result = "Order ID: " + orderId + "\n";
        result += "Products:\n";

        for (Product product : products) {
            result += product + "\n";
        }

        result += "Total: " + calculateTotal();

        return result;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String orderId = sc.nextLine();
        int numberOfProducts = Integer.parseInt(sc.nextLine());

        Order order = new Order(orderId);

        for (int i = 0; i < numberOfProducts; i++) {

            String input = sc.nextLine();

            if (input.trim().isEmpty()) {
                i--;
                continue;
            }

            String[] data = input.split(",");

            String productName = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            Product product = new Product(productName, price, quantity);

            order.addProduct(product);
        }

        System.out.println(order);

        sc.close();
    }
}

