import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }
}

class Car extends Vehicle {
    Car() {
        super();  // explicitly calls parent class constructor
        System.out.println("Car constructor called");
    }
}

public class MJ_03_SuperConstructor {
    public static void main(String[] args) {
        Car c = new Car();

        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}
