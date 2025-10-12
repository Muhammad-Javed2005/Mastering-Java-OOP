import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;


class Test {
    void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above!");
        } else {
            System.out.println("You are eligible.");
        }
    }
}

public class MJ_05_ThrowThrows {
    public static void main(String[] args) {
        Test obj = new Test();
        try {
            obj.checkAge(16);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

