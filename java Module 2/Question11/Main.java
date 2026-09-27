class Room {
    private String roomNumber;
    private String block;
    private String type;

    Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    // Getters
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + " " + block + " " + type;
    }
}

class Student {
    private String name;
    private int roll;
    private String course;
    private Room room;

    Student(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getCourse() {
        return course;
    }

    public Room getRoom() {
        return room;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course +
               "\n\n" + room;
    }
}

public class Main {
    public static void main(String[] args) {

        String studentInput = "Ravi,101,CSE";
        String roomInput = "A101,Block-B,Single";

        String[] studentData = studentInput.split(",");
        String[] roomData = roomInput.split(",");

        Room room = new Room(
            roomData[0],
            roomData[1],
            roomData[2]
        );

        Student student = new Student(
            studentData[0],
            Integer.parseInt(studentData[1]),
            studentData[2],
            room
        );

        System.out.println(student);
    }
}