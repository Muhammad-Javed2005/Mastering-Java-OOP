import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_05_ThisAsReturn {
    int x;

    MJ_05_ThisAsReturn setX(int x) {
        this.x = x;
        return this; // returning current object
    }

    void display() {
        System.out.println("Value of x = " + x);
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        new MJ_05_ThisAsReturn().setX(50).display(); // method chaining

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
