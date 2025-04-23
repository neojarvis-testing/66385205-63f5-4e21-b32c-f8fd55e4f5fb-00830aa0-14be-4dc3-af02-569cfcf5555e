package main;
public class Main {
    public static void main(String[] args) {
        ProgressBar progressBar = new ProgressBar();

        for (int i = 0; i <= 100; i += 5) {
            try {
                Thread.sleep(100);
                progressBar.updateProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Task Completed!");
    }
}