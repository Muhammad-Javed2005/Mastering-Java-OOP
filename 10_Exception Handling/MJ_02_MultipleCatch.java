import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



public class MJ_02_MultipleCatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}

