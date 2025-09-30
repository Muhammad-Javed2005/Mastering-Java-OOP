import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_02_ThisDemo {

    int x; // instance variable

    MJ_02_ThisDemo(int x) {
        this.x = x; // 'this' differentiates local variable from instance variable
    }

    void display() {
        System.out.println("Value of x = " + x);
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MJ_02_ThisDemo obj = new MJ_02_ThisDemo(20);
        obj.display();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}