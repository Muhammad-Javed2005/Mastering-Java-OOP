import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

// Java uses pass by value
class PassByValue1 {
    void change(int x) {
        x = x + 10;
    }
}

public class MJ_12_PassByValue1 {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        int num = 5;
        PassByValue1 obj = new PassByValue1();
        obj.change(num);
        System.out.println("Value after method call: " + num); // remains 5

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
