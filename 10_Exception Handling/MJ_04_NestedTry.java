import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



public class MJ_04_NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }

            int arr[] = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }

        System.out.println("This program is developed by Engr. Muhammad Javed");


    }
}



