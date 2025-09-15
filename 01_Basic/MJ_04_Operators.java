import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


public class  MJ_04_Operators{
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

         int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Increment & Decrement
        int c = 7;
        System.out.println("c++ = " + (c++)); // post-increment
        System.out.println("++c = " + (++c)); // pre-increment
        System.out.println("c-- = " + (c--)); // post-decrement
        System.out.println("--c = " + (--c)); // pre-decrement

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
