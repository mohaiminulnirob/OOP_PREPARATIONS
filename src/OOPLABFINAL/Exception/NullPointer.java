package OOPLABFINAL.Exception;

class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            // Call a method that throws NullPointerException
            demonstrateThrows();
        } catch (NullPointerException e) {
            // Handle the exception
            System.out.println("Caught a NullPointerException in main method.");
            System.out.println("Exception message: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Always executes
            System.out.println("Finally block executed.");
        }

        System.out.println("Program execution continues...");
    }

    // Method with throws declaration
    public static void demonstrateThrows() throws NullPointerException {
        String str = null;

        // Deliberately throw a NullPointerException
        if (str == null) {
            throw new NullPointerException("String is null, cannot call length.");
        }

        // This line won't be executed if the exception is thrown
        System.out.println("Length of the string: " + str.length());
    }
}
