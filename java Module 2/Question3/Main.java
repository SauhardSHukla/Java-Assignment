import java.util.Scanner;

class Employee {

    private String name;
    private String id;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

class Manager extends Employee {

    private double bonus;

    public Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + getName() + " (" + getId() + ") Salary: " + calculateSalary();
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {

            String input = sc.nextLine();

            if (input.trim().isEmpty()) {
                continue;
            }

            String[] data = input.split(",");

            if (data[0].equalsIgnoreCase("Employee")) {

                String name = data[1];
                String id = data[2];
                double basicSalary = Double.parseDouble(data[3]);

                Employee employee = new Employee(name, id, basicSalary);
                System.out.println(employee);

            } else if (data[0].equalsIgnoreCase("Manager")) {

                String name = data[1];
                String id = data[2];
                double basicSalary = Double.parseDouble(data[3]);
                double bonus = Double.parseDouble(data[4]);

                Manager manager = new Manager(name, id, basicSalary, bonus);
                System.out.println(manager);
            }
        }

        sc.close();
    }
}