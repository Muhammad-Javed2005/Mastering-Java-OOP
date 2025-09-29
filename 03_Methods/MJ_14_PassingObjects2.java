import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Box {
    int length;
}

public class MJ_14_PassingObjects2 {

    void modify(Box b) {
        b.length = b.length + 5;
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        Box b1 = new Box();
        b1.length = 10;
        new MJ_14_PassingObjects2().modify(b1);
        System.out.println("Box length: " + b1.length); // becomes 15

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
