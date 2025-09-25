import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_02_MethodOverloading2 {

    void sum(int a, int b) {
        System.out.println("Sum of 2 ints: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of 3 ints: " + (a + b + c));
    }

    void sum(double a, int b) {
        System.out.println("Sum of double + int: " + (a + b));
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MJ_02_MethodOverloading2 obj = new MJ_02_MethodOverloading2();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
        obj.sum(5.5, 10);
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
