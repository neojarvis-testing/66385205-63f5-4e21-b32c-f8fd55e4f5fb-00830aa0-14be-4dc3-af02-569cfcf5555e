package utils;
import javax.swing.*;

public class ProgressBar {
    private JProgressBar progressBar;
    private JFrame frame;

    public ProgressBar() {
        frame = new JFrame("Progress Bar");
        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 50, 300, 30);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(progressBar);
        frame.setVisible(true);
    }

    public void updateProgress(int value) {
        progressBar.setValue(value);
    }
}