import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


public class MJ_05_ControlStatment {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        int num = 10;


        // if-else
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }



        // switch
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }



        // for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();



        // while loop
        System.out.println("While loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println("i = " + i);
            i++;
        }



        // do-while loop
        System.out.println("Do-while loop:");
        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 2);



        // break & continue
        System.out.println("Break & Continue:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) continue; // skip 3
            if (k == 5) break;    // stop at 5
            System.out.print(k + " ");
        }

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
