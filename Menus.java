import javax.swing.*;

public class Menus {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu with Icons");

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        // Icons (image files should be in your project folder)
        ImageIcon newIcon = new ImageIcon("new.png");
        ImageIcon openIcon = new ImageIcon("open.png");
        ImageIcon exitIcon = new ImageIcon("exit.png");

        // Menu items with icons
        JMenuItem newItem = new JMenuItem("New", newIcon);
        JMenuItem openItem = new JMenuItem("Open", openIcon);
        JMenuItem exitItem = new JMenuItem("Exit", exitIcon);

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
