import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;


// Interface 1
interface CellPhone {
    void makeCall();
}

//  Interface 2
interface GPS {
    void navigate();
}

//  Interface 3
interface Camera {
    void takePhoto();
}

// 🎵 Interface 4
interface MediaPlayer {
    void playMusic();
}

//  Class: Implements all interfaces
class SmartPhone implements CellPhone, GPS, Camera, MediaPlayer {

    public void makeCall() {
        System.out.println("Calling from SmartPhone...");
    }

    public void navigate() {
        System.out.println("Navigating using SmartPhone GPS...");
    }

    public void takePhoto() {
        System.out.println("Taking photo with SmartPhone camera...");
    }

    public void playMusic() {
        System.out.println("Playing music on SmartPhone...");
    }
}


public class  MJ_04_PolymorphismInInterface{
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);


        // Polymorphism using interface references

        CellPhone phone = new SmartPhone();
        phone.makeCall();

        GPS gps = new SmartPhone();
        gps.navigate();

        Camera camera = new SmartPhone();
        camera.takePhoto();

        MediaPlayer player = new SmartPhone();
        player.playMusic();


        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
