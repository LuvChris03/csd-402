import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList filled with a minimum of 10 Strings
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");
        items.add("Fig");
        items.add("Grape");
        items.add("Honeydew");
        items.add("Kiwi");
        items.add("Lemon");

        // Use a 'for-each' loop to print the ArrayList collection
        System.out.println("Here is the collection:");
        for (String item : items) {
            System.out.println(item);
        }

        // Ask the user which element they would like to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the element you would like to see again: ");
        
        // Working with a user String input
        String userInput = scanner.nextLine();

        try {
            // Autoboxing: Integer.valueOf() returns an Integer object
            Integer indexObject = Integer.valueOf(userInput);
            
            // Auto-unboxing: The Integer object is automatically converted to primitive int
            int index = indexObject;
            
            // Attempt printing the element
            String selectedElement = items.get(index);
            System.out.println("You selected: " + selectedElement);
            
        } catch (IndexOutOfBoundsException e) {
            // If the element value received is invalid (out of bounds)
            System.out.println("Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number.");
        }
        
        scanner.close();
    }
}
