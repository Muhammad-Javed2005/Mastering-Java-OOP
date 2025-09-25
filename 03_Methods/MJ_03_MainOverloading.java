import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

public class MJ_03_MainOverloading {

    public static void main(String[] args) {
        System.out.println("Main with String[] args");
        main(10);
        main("Hello");
    }

    public static void main(int a) {
        System.out.println("Main with int: " + a);
    }

    public static void main(String str) {
        System.out.println("Main with String: " + str);

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
