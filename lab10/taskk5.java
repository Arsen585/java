import javax.swing.*;
import java.awt.*;

public class taskk5 extends JPanel {
    int x = 100, y = 100;

    public taskk5() {
        JTextField tfX = new JTextField(5);
        JTextField tfY = new JTextField(5);
        JButton btn = new JButton("Draw");

        btn.addActionListener(e -> {
            x = Integer.parseInt(tfX.getText());
            y = Integer.parseInt(tfY.getText());
            repaint();
        });

        add(tfX); add(tfY); add(btn);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task5");
        f.add(new taskk5());
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}