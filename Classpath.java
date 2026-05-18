import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Classpath
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");
f.setLayout(null);
f.setSize(300,300);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);

JButton b = new JButton("CONNECT");
b.setBounds(50,50,150,50);
f.add(b);

b.addMouseListener(new MouseAdapter()
{
public void mouseClicked(MouseEvent e)
{
String url = "jdbc:mysql://localhost:3306";
String user = "root";
String password ="";
try
{
Connection conn = DriverManager.getConnection(url, user, password);
System.out.println("Connected Successfully with MySQL Database Server!");
conn.close();
}
catch(SQLException d)
{
System.out.println("Connection Failed!");
d.printStackTrace();
}

}
});
}
}
