import javax.swing.*;

public class taskk8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calc");

        JTextField a = new JTextField(5);
        JTextField b = new JTextField(5);
        JButton btn = new JButton("+");
        JLabel res = new JLabel();

        btn.addActionListener(e -> {
            int sum = Integer.parseInt(a.getText()) + Integer.parseInt(b.getText());
            res.setText("= " + sum);
        });

        JPanel p = new JPanel();
        p.add(a); p.add(b); p.add(btn); p.add(res);

        f.add(p);
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}