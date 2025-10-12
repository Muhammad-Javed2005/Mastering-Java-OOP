import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class MJ_06_CustomException {
    static void validate(int number) throws MyException {
        if (number < 0) {
            throw new MyException("Number cannot be negative!");
        } else {
            System.out.println("Valid number: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            validate(-5);
        } catch (MyException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}

