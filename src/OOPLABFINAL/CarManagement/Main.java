package OOPLABFINAL.CarManagement;

public class Main {
    public static void main(String[] args) {
        // Create a few car objects
        Car car1 = new Car("ABC-123", "Toyota Corolla");
        Car car2 = new Car("XYZ-789", "Honda Civic");

        // Display car details
        car1.displayDetails();
        car2.displayDetails();
        System.out.println();

        // Reserve a car
        System.out.println("Attempting to reserve car 1:");
        car1.reserve();
        System.out.println();

        // Try to reserve the same car again
        System.out.println("Attempting to reserve car 1 again:");
        car1.reserve();
        System.out.println();

        // Release the car
        System.out.println("Releasing car 1:");
        car1.release();
        System.out.println();

        // Try releasing an already available car
        System.out.println("Releasing car 1 again:");
        car1.release();
        System.out.println();

        // Reserve car 2
        System.out.println("Attempting to reserve car 2:");
        car2.reserve();
        System.out.println();

        // Display updated details
        car1.displayDetails();
        car2.displayDetails();
    }
}
