import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



public class MJ_01_TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Arithmetic Exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program continues after exception handling.");

        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}
