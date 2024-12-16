package OOPLABFINAL.Average;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example array of student marks
        int[] studentMarks = {85, 42, 78, 90, 67, 56, 88, 72, 50};

        // Stream expression to filter marks > 70 and calculate the average
        double average = Arrays.stream(studentMarks)
                .filter(mark -> mark > 70)  // Filter marks greater than 70
                .average()                // Calculate the average
                .orElse(0.0);              // Handle case where no marks > 70

        // Output the result
        System.out.println("Average of marks greater than 70: " + average);
    }
}
