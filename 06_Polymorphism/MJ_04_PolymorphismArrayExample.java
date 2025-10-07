import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Polymorphism using array of objects

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running");
    }
}

public class MJ_04_PolymorphismArrayExample {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        Vehicle[] v = new Vehicle[3]; // array of Vehicle references

        v[0] = new Vehicle();
        v[1] = new Car();
        v[2] = new Bike();

        for (Vehicle vehicle : v) {
            vehicle.run(); // runtime polymorphism
        }
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
