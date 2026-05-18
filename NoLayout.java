import javax.swing.*;

public class NoLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Layout Example");

        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(50, 40, 120, 30);

        JLabel label = new JLabel("Hello Swing");
        label.setBounds(50, 80, 120, 30);

        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
