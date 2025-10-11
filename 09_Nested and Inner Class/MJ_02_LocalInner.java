import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;



class LocalOuter {
    void outerMethod() {
        System.out.println("Inside outer method.");

        // Local Inner Class
        class LocalInner {
            void show() {
                System.out.println("Hello from Local Inner Class!");
            }
        }

        // Object of Local Inner Class
        LocalInner inner = new LocalInner();
        inner.show();
    }
}

public class MJ_02_LocalInner {
    public static void main(String[] args) {
        LocalOuter obj = new LocalOuter();
        obj.outerMethod();
        
        System.out.println("This program is developed by Engr. Muhammad Javed");

    }
}

