import java.util.Scanner;

abstract class Flight {

    private String flightNumber;
    private String airline;
    private double fare;

    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public double getFare() {
        return fare;
    }

    public abstract double calculateFare();

    @Override
    public String toString() {
        return "Flight No: " + flightNumber +
               " Airline: " + airline +
               " Fare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {

    public DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.10);
    }
}

class InternationalFlight extends Flight {

    public InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.25);
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

            String type = data[0];
            String flightNumber = data[1];
            String airline = data[2];
            double fare = Double.parseDouble(data[3]);

            Flight flight;

            if (type.equalsIgnoreCase("Domestic")) {
                flight = new DomesticFlight(flightNumber, airline, fare);
            } else {
                flight = new InternationalFlight(flightNumber, airline, fare);
            }

            System.out.println(flight);
        }

        sc.close();
    }
}