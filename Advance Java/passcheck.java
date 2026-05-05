import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public pswd extends JFrame implements ActionListener
{
JPasswordField jp1;
JButton b1;
public pswd()
{
setTitle("check Password");
setLayout(new FlowLayout());
setVisible(true);
setSize(500,500);
JLabel l1=new JLabel("Enter password");
jp1=new JPasswordField(8);
b1=new JButton("CHECK");
add(l1);
add(jp1);
add(b1);
b1.addActionListener(this);
}
void dia()
{
JDialog j1=new JDialog();
j1.setLayout(new FlowLayout());
j1.setVisible(true);
j1.setSize(500,500);
j1.add(new Label("Password length must be >6 characters"));
}
public void actionPerformed(ActionEvent ae)
{
String txt=jp1.getText();
if(txt.length<6)
{
dia();
}
}
public static void main(String args[])
{
new passcheck();
}
}
