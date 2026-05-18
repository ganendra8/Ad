import javax.swing.*;
import java.awt.*;

public class FlowLayoutEg {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");

        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
