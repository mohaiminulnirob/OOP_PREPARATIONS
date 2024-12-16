package stream;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string to reverse: ");
        String originalString = scanner.nextLine();

        // Call the method to reverse the string
        String reversedString = reverseString(originalString);

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        String reversed=new String(); // Use StringBuilder for efficient string manipulation

        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed +=str.charAt(i); // Append each character to the StringBuilder
        }

        return reversed; // Convert StringBuilder to String and return
    }
}
