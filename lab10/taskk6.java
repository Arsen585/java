import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class taskk6 extends JPanel {
    int x=0,y=0;

    public taskk6() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x,y,5,5);
        g.drawString("X:"+x+" Y:"+y,10,20);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task6");
        f.add(new taskk6());
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}