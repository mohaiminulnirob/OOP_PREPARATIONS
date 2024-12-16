package OOPLABFINAL.CarManagement;

public class Car {
    private String licensePlate;
    private String model;
    private boolean isAvailable;

    // Constructor
    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.isAvailable = true; // Default availability is true
    }

    // Method to reserve the car
    public boolean reserve() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car " + model + " (" + licensePlate + ") has been reserved.");
            return true;
        } else {
            System.out.println("Car " + model + " (" + licensePlate + ") is already reserved.");
            return false;
        }
    }

    // Method to release the car
    public void release() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Car " + model + " (" + licensePlate + ") has been released.");
        } else {
            System.out.println("Car " + model + " (" + licensePlate + ") is already available.");
        }
    }

    // Method to check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Reserved"));
    }
}

