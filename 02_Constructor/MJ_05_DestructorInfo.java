import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Temp {
    int id;

    Temp(int id) {
        this.id = id;
        System.out.println("Object Created with id: " + id);
    }

    // finalize() is called before object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object with id " + id + " is being destroyed.");
    }
}

public class MJ_05_DestructorInfo {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

        Temp t1 = new Temp(1);
        Temp t2 = new Temp(2);

        // Making objects eligible for garbage collection
        t1 = null;
        t2 = null;

        // Requesting Garbage Collector
        System.gc();

        System.out.println("End of program.");

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
