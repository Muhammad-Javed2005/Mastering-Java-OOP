import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_11_VarargsMethodOverloading {

    void show(int... nums) {
        System.out.println("Varargs method with ints");
    }

    void show(String msg, int... nums) {
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MJ_11_VarargsMethodOverloading obj = new MJ_11_VarargsMethodOverloading();
        obj.show(1, 2, 3);
        obj.show("Hello", 10, 20);

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}

