import java.util.Scanner;

class TicketBooking {
    int availableSeats;

    TicketBooking(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    synchronized void bookSeat(int seats, String user) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println(user + " booked " + seats + " seat(s) successfully");
        } else {
            System.out.println(user + " booking failed. Not enough seats");
        }
    }
}

class User1 extends Thread {
    TicketBooking booking;
    int seats;

    User1(TicketBooking booking, int seats) {
        this.booking = booking;
        this.seats = seats;
    }

    public void run() {
        booking.bookSeat(seats, "User1");
    }
}

class User2 extends Thread {
    TicketBooking booking;
    int seats;

    User2(TicketBooking booking, int seats) {
        this.booking = booking;
        this.seats = seats;
    }

    public void run() {
        booking.bookSeat(seats, "User2");
    }
}

public class RailwayBooking {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Available Seats: ");
        int availableSeats = sc.nextInt();

        System.out.print("User1 wants to book: ");
        int seats1 = sc.nextInt();

        System.out.print("User2 wants to book: ");
        int seats2 = sc.nextInt();

        TicketBooking booking = new TicketBooking(availableSeats);

        User1 user1 = new User1(booking, seats1);
        User2 user2 = new User2(booking, seats2);

        user1.start();
        user1.join();

        user2.start();
        user2.join();
    }
}