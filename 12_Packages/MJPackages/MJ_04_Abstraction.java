package MJPackages;

import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



// Abstract Class
abstract class Vehicle {
    abstract void start();
    abstract void stop();

    public void fuel() {
        System.out.println("Vehicle needs fuel ⛽");
    }
}

// Concrete Class
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key 🔑");
    }

    @Override
    void stop() {
        System.out.println("Car stops with brake 🛑");
    }
}

public class MJ_04_Abstraction {
    public void demo() {
        Vehicle v = new Car();
        System.out.println("Abstraction → Abstract class with concrete implementation:");
        v.start();
        v.fuel();
        v.stop();
    }
}

