import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class taskk4 extends JPanel {

    Color color = Color.RED;

    public taskk4() {
        JButton btn = new JButton("Change Color");

        btn.addActionListener(e -> {
            if(color == Color.RED) color = Color.GREEN;
            else if(color == Color.GREEN) color = Color.BLUE;
            else color = Color.RED;

            repaint();
        });

        add(btn);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task4");
        f.add(new taskk4());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}