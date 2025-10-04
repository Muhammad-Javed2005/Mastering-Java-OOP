import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

class Samsung {
    void brand() {
        System.out.println("Brand: Samsung");
    }

    void basicFeatures() {
        System.out.println("Basic Features: Calling, Messaging, Camera");
    }

    void batteryLife() {
        System.out.println("Battery Life: 3000mAh");
    }
}

class SamsungGalaxy extends Samsung {
    // Overriding parent method
    @Override
    void batteryLife() {
        System.out.println("Battery Life: 5000mAh with fast charging");
    }

    // New method 1
    void displayType() {
        System.out.println("Display: AMOLED, 120Hz refresh rate");
    }

    // New method 2
    void securityFeatures() {
        System.out.println("Security: Fingerprint, Face Unlock, Knox");
    }
}


public class MJ_05_DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("Hi, Javed!");
        Scanner sc = new Scanner(System.in);

         // Object of subclass
        SamsungGalaxy galaxyPhone = new SamsungGalaxy();

        // Calling methods
        galaxyPhone.brand();              // From parent
        galaxyPhone.basicFeatures();      // From parent
        galaxyPhone.batteryLife();        // Overridden method
        galaxyPhone.displayType();        // Subclass method
        galaxyPhone.securityFeatures();   // Subclass method

        System.out.println("This program is developed by Engr. Muhammad Javed");
    }
}
