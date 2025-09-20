import java.util.*;
import java.io.*;
import java.time.*;
import java.lang.*;

class Book {
    String title;
    int price;

    // Normal constructor
    Book(String t, int p) {
        title = t;
        price = p;
    }

    // Copy Constructor (manually defined)
    Book(Book b) {
        title = b.title;
        price = b.price;
    }

    void display() {
        System.out.println("Book: " + title + ", Price: " + price);
    }
}





public class MJ_03_CopyConstructor {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);


        Book b1 = new Book("Java Basics", 500);
        Book b2 = new Book(b1); // Copying b1 into b2

        b1.display();
        b2.display();

        
        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
