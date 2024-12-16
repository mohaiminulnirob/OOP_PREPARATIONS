package OOPLABFINAL.PrintNumberThread;

class SecondaryThread extends Thread {
    @Override
    public void run() {
        // Secondary thread prints numbers from 5 to 1 in reverse order
        for (int i = 5; i >= 1; i--) {
            System.out.println("Secondary Thread: " + i);
            try {
                // Sleep for a short duration to simulate some work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
