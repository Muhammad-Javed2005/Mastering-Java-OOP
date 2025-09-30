import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_01_ThisConstructorCall {

    int a, b;

    MJ_01_ThisConstructorCall() {
        this(10, 20); // calls parameterized constructor
        System.out.println("Default constructor called");
    }

    MJ_01_ThisConstructorCall(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parameterized constructor called: a=" + a + ", b=" + b);
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MJ_01_ThisConstructorCall obj = new MJ_01_ThisConstructorCall();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
