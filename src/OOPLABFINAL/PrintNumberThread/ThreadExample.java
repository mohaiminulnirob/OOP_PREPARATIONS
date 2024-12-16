package OOPLABFINAL.PrintNumberThread;

public class ThreadExample {
    public static void main(String[] args) {
        // Create instances of the threads
        MainThread mainThread = new MainThread();
        SecondaryThread secondaryThread = new SecondaryThread();

        // Start both threads
        mainThread.start();
        secondaryThread.start();

        // Wait for both threads to complete
        try {
            mainThread.join();
            secondaryThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have completed execution.");
    }
}