import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_08_ReturningValues2 {

    String greet(String name) {
        return "Hello, " + name;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MJ_08_ReturningValues2 obj = new MJ_08_ReturningValues2();
        System.out.println(obj.greet("Bob"));
        System.out.println("Sum: " + obj.add(3.5, 2.5));

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
