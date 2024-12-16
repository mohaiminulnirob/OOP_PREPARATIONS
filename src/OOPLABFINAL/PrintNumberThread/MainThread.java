package OOPLABFINAL.PrintNumberThread;

class MainThread extends Thread {
    @Override
    public void run() {
        // Main thread prints numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                // Sleep for a short duration to simulate some work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
