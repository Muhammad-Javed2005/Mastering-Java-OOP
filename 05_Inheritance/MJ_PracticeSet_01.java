import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {
        radius = 32;
        height = 24;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getRadius(int r) {
        return this.radius;
    }

    public int getHeight(int h) {
        return this.height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class MJ_PracticeSet_01 {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        int radius = sc.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        int height = sc.nextInt();

        // Cylinder c = new Cylinder(radius, height);
        Cylinder c = new Cylinder();

        System.out.println("The volume of the cylinder is: " + c.getVolume());
        System.out.println("The surface area of the cylinder is: " + c.getSurfaceArea());

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
