package OOPLABFINAL.ThreadCreation;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starts...");

        // Create and start a thread using Runnable
        Runnable taskRunnable = new TaskRunnable("RunnableThread");
        Thread thread1 = new Thread(taskRunnable);
        thread1.start();

        // Create and start a thread by extending Thread
        TaskThread thread2 = new TaskThread("ThreadClassThread");
        thread2.start();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread is running: Step " + i);
            try {
                Thread.sleep(500); // Simulate some work by pausing the thread
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted.");
            }
        }

        System.out.println("Main thread ends...");
    }
}
