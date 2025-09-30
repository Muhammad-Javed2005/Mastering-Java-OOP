import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Helper {
    void print(MJ_04_ThisAsArgument obj) {
        System.out.println("Method called using current object reference");
    }
}

public class MJ_04_ThisAsArgument {

    void call() {
        Helper h = new Helper();
        h.print(this); // passing current object
    }

    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);
        MJ_04_ThisAsArgument obj = new MJ_04_ThisAsArgument();
        obj.call();

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
