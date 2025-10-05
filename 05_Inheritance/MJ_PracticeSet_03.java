import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

class Circle
{
    public int radius;

    Circle(int r) {
        this.radius = r;
    }


    public float area ()
    {
        return (float) Math.PI * radius * radius;
    }
    
}


class Cylinder extends Circle
{
    public int hight;

    Cylinder(int r , int h)
    {
        super(r);
        this.hight = h;
    }


    public double volume()
    {
        return (double) Math.PI * radius * radius * hight;
    }
    

}


public class MJ_PracticeSet_03 {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle(12);
        System.out.println("Area of Circle is " + c.area());

        Cylinder cy = new Cylinder(12, 23);
        System.out.println("Volume of Cylinder is " + cy.volume());

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}


