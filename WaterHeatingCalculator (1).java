import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Water Heating Energy Calculator ===\n");
        
        double waterMass = 0;
        double initialTemperature = 0;
        double finalTemperature = 0;
        
        try {
            System.out.print("Enter the amount of water in kilograms: ");
            waterMass = scanner.nextDouble();
            
            System.out.print("Enter the initial temperature in Celsius: ");
            initialTemperature = scanner.nextDouble();
            
            System.out.print("Enter the final temperature in Celsius: ");
            finalTemperature = scanner.nextDouble();
            
            if (waterMass <= 0) {
                System.out.println("\nError: Water mass must be a positive value.");
                scanner.close();
                return;
            }
            
            double temperatureDifference = finalTemperature - initialTemperature;
            double Q = waterMass * temperatureDifference * 4184;
            
            System.out.println("\n=== Results ===");
            System.out.printf("Water mass: %.2f kg%n", waterMass);
            System.out.printf("Initial temperature: %.2f °C%n", initialTemperature);
            System.out.printf("Final temperature: %.2f °C%n", finalTemperature);
            System.out.printf("Temperature change: %.2f °C%n", temperatureDifference);
            System.out.printf("%nEnergy needed (Q): %.2f Joules%n", Q);
            
            if (Q < 0) {
                System.out.println("\nNote: Negative energy indicates heat is released (cooling water).");
            } else if (Q == 0) {
                System.out.println("\nNote: No energy transfer needed (temperatures are equal).");
            }
            
        } catch (Exception e) {
            System.out.println("\nError: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
