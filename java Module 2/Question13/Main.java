import java.util.ArrayList;
import java.util.List;

class Guest {
    String name;
    int age;
    String idProof;

    Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    String reservationId;
    String roomType;
    List<Guest> guests;

    Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        guests = new ArrayList<>();
    }

    void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {
        String result = "Reservation ID: " + reservationId +
                        " Room: " + roomType + "\n" +
                        "Guests:\n\n";

        for (Guest guest : guests) {
            result += guest + "\n";
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        Reservation reservation =
                new Reservation("R101", "Deluxe");

        Guest guest1 = new Guest("Amit", 25, "ID123");
        Guest guest2 = new Guest("Sara", 22, "ID456");

        reservation.addGuest(guest1);
        reservation.addGuest(guest2);

        System.out.println(reservation);
    }
}