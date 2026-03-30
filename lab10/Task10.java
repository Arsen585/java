import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task10 extends JPanel {
    Color color = Color.RED;

    public Task10() {
        JCheckBox r = new JCheckBox("Red");
        JCheckBox g = new JCheckBox("Green");
        JCheckBox b = new JCheckBox("Blue");

        ActionListener al = e -> {
            if(r.isSelected()) color = Color.RED;
            if(g.isSelected()) color = Color.GREEN;
            if(b.isSelected()) color = Color.BLUE;
            repaint();
        };

        r.addActionListener(al);
        g.addActionListener(al);
        b.addActionListener(al);

        add(r); add(g); add(b);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(100,100,100,100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task10");
        f.add(new Task10());
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}