import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== Rock-Paper-Scissors Game ===\n");
        
        int computerChoice = random.nextInt(3) + 1;
        
        System.out.println("Choose your move:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("\nEnter your choice (1, 2, or 3): ");
        
        try {
            int userChoice = scanner.nextInt();
            
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("\nError: Please enter 1, 2, or 3.");
                scanner.close();
                return;
            }
            
            String computerMove = getMoveName(computerChoice);
            String userMove = getMoveName(userChoice);
            
            System.out.println("\n=== Results ===");
            System.out.println("Your choice: " + userMove);
            System.out.println("Computer's choice: " + computerMove);
            System.out.println();
            
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println("\nError: Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
    
    public static String getMoveName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }
    
    public static String determineWinner(int user, int computer) {
        if (user == computer) {
            return "It's a TIE!";
        }
        
        boolean userWins = (user == 1 && computer == 3) ||
                          (user == 2 && computer == 1) ||
                          (user == 3 && computer == 2);
        
        if (userWins) {
            return "YOU WIN!";
        } else {
            return "COMPUTER WINS!";
        }
    }
}
