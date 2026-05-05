import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class user extends JFrame implements ActionListener
{
JButton b1;
JTextField jtf;
public user()
{
setLayout(new FlowLayout());
setTitle("user authentication");
setVisible(true);
setSize(300,300);
b1=new JButton("Submit");
JLabel l1=new JLabel("Enter username");
JLabel l2=new JLabel("Enter password");
 jtf=new JTextField(8);
JPasswordField jp1=new JPasswordField(8);
add(l1);
add(jtf);
add(l2);
add(jp1);
add(b1);
b1.addActionListener(this);
}
void dia()
{
JDialog d=new JDialog();
d.setLayout(new FlowLayout());
String str="Welocome"+" "+jtf.getText();
d.add(new JLabel(str));
d.setVisible(true);
d.setSize(500,500);
}
public void actionPerformed(ActionEvent ae)
{
dia();
}
public static void main(String args[])
{
new user();
}
}

 
