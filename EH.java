import javax.swing.*;
import java.awt.event.*;

public class EH {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed!");
            }
        });

        frame.add(button);

        frame.setSize(200, 100);
        frame.setLayout(null);
        button.setBounds(40, 20, 100, 30);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}