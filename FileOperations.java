import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        String fileName = "data.file";
        File file = new File(fileName);
        Random random = new Random();

        try {
            // Create a new file titled data.file, if the file does not exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the new file, adding 10 randomly generated numbers, 
            // or append 10 randomly generated numbers to a previous file.
            // true parameter in FileWriter constructor enables append mode
            FileWriter writer = new FileWriter(fileName, true);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100); // Generate numbers between 0-99
                sb.append(randomNumber).append(" ");
            }
            writer.write(sb.toString());
            writer.close(); // Close the file
            System.out.println("Successfully wrote 10 random numbers to the file.");

            // Reopen the file and read the data from the file and display it
            System.out.println("Reading data from file:");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
