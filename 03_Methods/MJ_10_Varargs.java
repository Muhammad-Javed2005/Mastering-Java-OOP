import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;




public class MJ_10_Varargs {

    void printNumbers(int... nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        MJ_10_Varargs obj = new MJ_10_Varargs();
        obj.printNumbers(1, 2, 3);
        obj.printNumbers(10, 20, 30, 40, 50);

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}