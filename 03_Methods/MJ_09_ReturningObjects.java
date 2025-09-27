import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Returning objects from methods
class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }
}

public class MJ_09_ReturningObjects {

    Car getCar() {
        return new Car("Tesla");
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        MJ_09_ReturningObjects obj = new MJ_09_ReturningObjects();
        Car c = obj.getCar();
        System.out.println("Car brand: " + c.brand);

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}



