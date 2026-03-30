import javax.swing.*;
import java.awt.event.*;

public class taskk7 extends JFrame {
    JLabel label = new JLabel("Press key");

    public taskk7() {
        add(label);
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                label.setText("Symbol: " + e.getKeyChar());
            }
        });
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new taskk7();
    }
}