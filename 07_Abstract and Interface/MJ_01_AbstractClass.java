import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


// Abstract base class
abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }

    // Abstract methods
    public abstract double area();

    public abstract double perimeter();

    public abstract String getName();

    // Concrete method
    public void displayShapeInfo() {
        System.out.println("Shape: " + getName());
        displayColor();
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("--------------------------");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public void displayInfo() {
        System.out.println("Radius: " + radius);
        displayShapeInfo();
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        displayShapeInfo();
    }
}

// Rhombus class
class Rhombus extends Shape {
    double diagonal1, diagonal2, side;

    public Rhombus(String color, double d1, double d2, double side) {
        super(color);
        this.diagonal1 = d1;
        this.diagonal2 = d2;
        this.side = side;
    }

    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String getName() {
        return "Rhombus";
    }

    public void displayInfo() {
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
        System.out.println("Side: " + side);
        displayShapeInfo();
    }
}

public class MJ_01_AbstractClass {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        // Cannot be used to create objects directly
        // May have some completed methods and some empty (abstract) methods
        // Is used as a base for other classes

        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("Blue", 4, 6);
        Rhombus rh = new Rhombus("Green", 8, 6, 5);

        c.displayInfo();
        r.displayInfo();
        rh.displayInfo();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
