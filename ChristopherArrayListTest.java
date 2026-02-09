import java.util.ArrayList;
import java.util.Scanner;

public class ChristopherArrayListTest {
    /**
     * Finds the largest value in an ArrayList of Integers.
     * Returns 0 if the list is empty.
     */
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer maxValue = list.get(0);
        for (Integer value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to end):");
        
        while (true) {
            try {
                int value = input.nextInt();
                list.add(value);
                if (value == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid integer.");
                input.next(); // clear invalid input
            }
        }

        Integer maxValue = max(list);
        
        System.out.println("\n--- Results ---");
        System.out.println("ArrayList: " + list);
        System.out.println("The largest value is: " + maxValue);
        
        input.close();
    }
}
