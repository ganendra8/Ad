import javax.swing.*;
import java.awt.event.*;

public class MenuShortcut {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mnemonics and Accelerators Example");

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        // Menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // 🔹 Set Mnemonics (Alt + Key)
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F opens File menu
        newItem.setMnemonic(KeyEvent.VK_N);  // N for New
        openItem.setMnemonic(KeyEvent.VK_O); // O for Open
        exitItem.setMnemonic(KeyEvent.VK_X); // X for Exit

        // 🔹 Set Accelerators (Ctrl + Key)
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        // Add items to menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
