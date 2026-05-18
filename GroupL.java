import javax.swing.*;
import java.awt.*;

public class GroupL {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Example");

        JButton btnOk = new JButton("OK");

        JButton btnCancel = new JButton("Cancel");
        JLabel label = new JLabel("Username:");
        JTextField textField = new JTextField(15);

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        // Let GroupLayout create gaps automatically
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // 🔹 Horizontal grouping
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(label)
                        .addComponent(btnOk)
                )
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(textField)
                        .addComponent(btnCancel)
                )
        );

        // 🔹 Vertical grouping
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(textField)
                )
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOk)
                        .addComponent(btnCancel)
                )
        );

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
