import javax.swing.*;
import java.awt.*;

public class Task9 extends JPanel {
    int x=0;

    public Task9() {
        Timer t = new Timer(50, e -> {
            x += 5;
            repaint();
        });
        t.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x,100,50,50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task9");
        f.add(new Task9());
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}