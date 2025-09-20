import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Multiple constructors (Constructor Overloading)

class Rectangle {
    int length, width;

    // Constructor with no arguments
    Rectangle() {
        length = 0;
        width = 0;
    }

    // Constructor with one argument
    Rectangle(int side) {
        length = width = side;
    }

    // Constructor with two arguments
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }
}



public class MJ_02_ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Area (default): " + r1.area());
        System.out.println("Area (square): " + r2.area());
        System.out.println("Area (rectangle): " + r3.area());

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}