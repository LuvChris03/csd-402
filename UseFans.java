import java.util.ArrayList;
import java.util.Collection;

public class UseFans {

    // Method taking a collection of Fan instances for displaying without using toString()
    public static void displayFans(Collection<Fan> fans) {
        System.out.println("Displaying all fans in collection:");
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    // Method that takes a single instance of a Fan for displaying without using toString()
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan status: ON | Speed: " + fan.getSpeed() + " | Radius: " + fan.getRadius() + " | Color: " + fan.getColor());
        } else {
            System.out.println("Fan status: OFF | Radius: " + fan.getRadius() + " | Color: " + fan.getColor());
        }
    }

    public static void main(String[] args) {
        // Create a collection of Fan instances
        ArrayList<Fan> fanCollection = new ArrayList<>();

        // Create fans and add to collection
        Fan f1 = new Fan(); // Default
        Fan f2 = new Fan(Fan.FAST, true, 12.0, "red");
        Fan f3 = new Fan(Fan.MEDIUM, true, 8.0, "black");
        Fan f4 = new Fan(Fan.SLOW, false, 5.0, "green");

        fanCollection.add(f1);
        fanCollection.add(f2);
        fanCollection.add(f3);
        fanCollection.add(f4);

        // Display functionality of all Fan instances in the collection
        displayFans(fanCollection);
    }
}
