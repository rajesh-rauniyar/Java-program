interface RemoteControl {
    void turnOn();
    void turnOff();
    void increaseVolume();
    void decreaseVolume();
}

class TV implements RemoteControl {
    int volume = 10;

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("TV Volume: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("TV Volume: " + volume);
    }
}

class AirConditioner implements RemoteControl {
    int volume = 5;

    public void turnOn() {
        System.out.println("AirConditioner is ON");
    }

    public void turnOff() {
        System.out.println("AirConditioner is OFF");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("AC Fan Speed: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("AC Fan Speed: " + volume);
    }
}

class Speaker implements RemoteControl {
    int volume = 15;

    public void turnOn() {
        System.out.println("Speaker is ON");
    }

    public void turnOff() {
        System.out.println("Speaker is OFF");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("Speaker Volume: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Speaker Volume: " + volume);
    }
}

interface Discount {
    double calculateDiscount(double amount);
}

class FestivalDiscount implements Discount {
    public double calculateDiscount(double amount) {
        return amount - (amount * 0.20);
    }
}

class SeasonalDiscount implements Discount {
    public double calculateDiscount(double amount) {
        return amount - (amount * 0.10);
    }
}

class MemberDiscount implements Discount {
    public double calculateDiscount(double amount) {
        return amount - (amount * 0.15);
    }
}

interface Vehicle {
    void start();
    void stop();
    void accelerate();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started");
    }

    public void stop() {
        System.out.println("Car Stopped");
    }

    public void accelerate() {
        System.out.println("Car Accelerating");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }

    public void stop() {
        System.out.println("Bike Stopped");
    }

    public void accelerate() {
        System.out.println("Bike Accelerating");
    }
}

class Truck implements Vehicle {
    public void start() {
        System.out.println("Truck Started");
    }

    public void stop() {
        System.out.println("Truck Stopped");
    }

    public void accelerate() {
        System.out.println("Truck Accelerating");
    }
}

interface SmartDevice {
    void connectToWiFi();
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void connectToWiFi() {
        System.out.println("SmartLight Connected to WiFi");
    }

    public void turnOn() {
        System.out.println("SmartLight ON");
    }

    public void turnOff() {
        System.out.println("SmartLight OFF");
    }
}

class SmartFan implements SmartDevice {
    public void connectToWiFi() {
        System.out.println("SmartFan Connected to WiFi");
    }

    public void turnOn() {
        System.out.println("SmartFan ON");
    }

    public void turnOff() {
        System.out.println("SmartFan OFF");
    }
}

class SmartDoorLock implements SmartDevice {
    public void connectToWiFi() {
        System.out.println("SmartDoorLock Connected to WiFi");
    }

    public void turnOn() {
        System.out.println("SmartDoorLock Locked");
    }

    public void turnOff() {
        System.out.println("SmartDoorLock Unlocked");
    }
}

public class interfaceassignment{
    public static void main(String[] args) {

        TV tv = new TV();
        tv.turnOn();
        tv.increaseVolume();
        tv.turnOff();

        FestivalDiscount fd = new FestivalDiscount();
        System.out.println("Festival Discount Price: " + fd.calculateDiscount((5000)));

        Car car = new Car();
        car.start();
        car.accelerate();
        car.stop();

        SmartLight light = new SmartLight();
        light.connectToWiFi();
        light.turnOn();
        light.turnOff();
    }
}
