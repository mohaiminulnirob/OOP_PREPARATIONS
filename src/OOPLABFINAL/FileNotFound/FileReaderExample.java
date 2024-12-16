package OOPLABFINAL.FileNotFound;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    public static void readFile(String filePath) {
        Scanner scanner = null;

        try {
            // Attempt to open and read the file
            File file = new File(filePath);
            scanner = new Scanner(file);

            // Read and print each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filePath);
            e.printStackTrace();

        } finally {
            // Ensure the scanner is closed, even if an exception occurs
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed successfully.");
            }
        }
    }

    public static void main(String[] args) {
        // Call readFile with a sample file path
        readFile("example.txt");
    }
}