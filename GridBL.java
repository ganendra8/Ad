
import javax.swing.*;
import java.awt.*;

public class GridBL {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 

        gbc.gridx = 0; // column
        gbc.gridy = 0; // row
        frame.add(new JButton("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("Button 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new JButton("Wide Button"), gbc);

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
