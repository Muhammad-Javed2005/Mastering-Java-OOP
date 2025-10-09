import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

// Parent Interface
interface Device {
    void powerOn();

    void powerOff();
}

// Child Interface inheriting from Device
interface SmartDevice extends Device {
    void connectToWiFi();

    void updateSoftware();
}

// Class 1: Implements SmartDevice
class SmartPhone implements SmartDevice {
    public void powerOn() {
        System.out.println("SmartPhone is powering ON...");
    }

    public void powerOff() {
        System.out.println("SmartPhone is shutting down...");
    }

    public void connectToWiFi() {
        System.out.println("SmartPhone connected to Wi-Fi.");
    }

    public void updateSoftware() {
        System.out.println("SmartPhone is updating software.");
    }
}

// Class 2: Implements SmartDevice
class Laptop implements SmartDevice {
    public void powerOn() {
        System.out.println("Laptop is starting...");
    }

    public void powerOff() {
        System.out.println("Laptop is shutting down...");
    }

    public void connectToWiFi() {
        System.out.println("Laptop connected to Wi-Fi.");
    }

    public void updateSoftware() {
        System.out.println("Laptop is updating software.");
    }
}

// Class 3: Implements SmartDevice
class SmartWatch implements SmartDevice {
    public void powerOn() {
        System.out.println("SmartWatch is turning ON.");
    }

    public void powerOff() {
        System.out.println("SmartWatch is turning OFF.");
    }

    public void connectToWiFi() {
        System.out.println("SmartWatch connected to Wi-Fi.");
    }

    public void updateSoftware() {
        System.out.println("SmartWatch software update in progress.");
    }
}

public class MJ_03_InheritanceInInterface {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        SmartDevice phone = new SmartPhone();
        SmartDevice laptop = new Laptop();
        SmartDevice watch = new SmartWatch();

        System.out.println("Testing SmartPhone:");
        phone.powerOn();
        phone.connectToWiFi();
        phone.updateSoftware();
        phone.powerOff();

        System.out.println("\nTesting Laptop:");
        laptop.powerOn();
        laptop.connectToWiFi();
        laptop.updateSoftware();
        laptop.powerOff();

        System.out.println("\nTesting SmartWatch:");
        watch.powerOn();
        watch.connectToWiFi();
        watch.updateSoftware();
        watch.powerOff();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
