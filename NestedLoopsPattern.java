Christopher Craig 12/21/2025

public class NestedLoopsPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            // Print descending powers of 2
            for (int j = i; j >= 0; j--) {
                System.out.print((int)Math.pow(2, j) + " ");
            }
            
            // Print the @ symbol
            System.out.print("@ ");
            
            // Print ascending powers of 2
            for (int j = 0; j <= i; j++) {
                System.out.print((int)Math.pow(2, j) + " ");
            }
            
            System.out.println();
        }
    }
}
