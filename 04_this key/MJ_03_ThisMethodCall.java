import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_03_ThisMethodCall {

    void display() {
        System.out.println("Inside display() method");
    }

    void show() {
        System.out.println("Inside show() method");
        this.display(); // calls display() method
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        MJ_03_ThisMethodCall obj = new MJ_03_ThisMethodCall();
        obj.show();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
