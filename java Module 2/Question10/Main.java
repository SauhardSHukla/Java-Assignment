interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {

    @Override
    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class Light implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

public class Main {
    public static void main(String[] args) {

        Device fan = new Fan();
        Device light = new Light();

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();
    }
}