import javax.swing.*;
import java.awt.event.*;

public class taskk3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Task3");

        JTextField tf = new JTextField(15);
        JButton btn = new JButton("OK");
        JLabel label = new JLabel();

        btn.addActionListener(e ->
                label.setText("Сәлем, " + tf.getText())
        );

        JPanel p = new JPanel();
        p.add(tf);
        p.add(btn);
        p.add(label);

        f.add(p);
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}