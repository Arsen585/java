
    import javax.swing.*;

    public class taskk2 {
        public static void main(String[] args) {
            JFrame f = new JFrame("Task2");
            JButton btn = new JButton("Click");

            btn.addActionListener(e -> btn.setText("Hello Java"));

            f.add(btn);
            f.setSize(300,200);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
    }

