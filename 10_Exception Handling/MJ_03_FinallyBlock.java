import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;




public class MJ_03_FinallyBlock {
    public static void main(String[] args) {
        try {
            int data = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block always executes!");
        }
    }
}

