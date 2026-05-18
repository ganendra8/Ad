import java.awt.*;
import java.awt.event.*;

public class AWT {
    public static void main(String[] args) {

        Frame f = new Frame("My First AWT Window");

        f.setSize(300, 200);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}