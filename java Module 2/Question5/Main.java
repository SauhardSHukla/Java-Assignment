class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Age: " + age;
    }
}

class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Specialization: " + specialization;
    }
}

class Surgeon extends Doctor {
    String surgeryType;

    Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Surgery Type: " + surgeryType;
    }
}

public class Main {
    public static void main(String[] args) {

        String input = "John,40,Cardiology,Heart Surgery";

        String[] data = input.split(",");

        Surgeon surgeon = new Surgeon(
            data[0],
            Integer.parseInt(data[1]),
            data[2],
            data[3]
        );

        System.out.println(surgeon);
    }
}