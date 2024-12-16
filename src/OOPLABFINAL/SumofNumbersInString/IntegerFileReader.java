package OOPLABFINAL.SumofNumbersInString;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IntegerFileReader {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        try {
            // Replace "numbers.txt" with the path to your file
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);

            // Reading integers until "end" is encountered
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    count++;
                    sum += number;
                } else if (scanner.hasNext("end")) {
                    break; // Stop if "end" is encountered
                } else {
                    // Skip any non-integer tokens
                    scanner.next();
                }
            }

            scanner.close();

            // Display the results
            System.out.println("Total Count of Integers: " + count);
            System.out.println("Sum of Integers: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
