import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_01_MethodOverloading1 {

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double b) {
        System.out.println("Double: " + b);
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MJ_01_MethodOverloading1 obj = new MJ_01_MethodOverloading1();
        obj.display(10);
        obj.display(5.5);
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}