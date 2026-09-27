class Vehicle {
    String regNo;
    String brand;
    double baseRate;

    Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {

    Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return baseRate * 1.5;
    }
}

class Bike extends Vehicle {

    Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return baseRate * 1.2;
    }
}

public class Main {
    public static void main(String[] args) {

        String input1 = "Car,KA01AA1234,Toyota,1000";
        String input2 = "Bike,KA05BB6789,Honda,500";

        String[] data1 = input1.split(",");
        String[] data2 = input2.split(",");

        Vehicle car = new Car(
            data1[1],
            data1[2],
            Double.parseDouble(data1[3])
        );

        Vehicle bike = new Bike(
            data2[1],
            data2[2],
            Double.parseDouble(data2[3])
        );

        System.out.println("Car " + car.regNo + " " +
                car.brand + " Rent: " + car.calculateRent());

        System.out.println("Bike " + bike.regNo + " " +
                bike.brand + " Rent: " + bike.calculateRent());
    }
}