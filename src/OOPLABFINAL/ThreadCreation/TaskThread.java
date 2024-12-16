package OOPLABFINAL.ThreadCreation;

class TaskThread extends Thread {
    private String taskName;

    public TaskThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " is running: Step " + i);
            try {
                Thread.sleep(500); // Simulate some work by pausing the thread
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
    }
}