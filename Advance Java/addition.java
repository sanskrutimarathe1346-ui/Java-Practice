import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class addition extends JFrame implements ActionListener
{
JButton b1;
JTextField jtf1,jtf2,jtf3;
public addition()
{
setLayout(new FlowLayout());
setTitle("ADDITION");
setVisible(true);
setSize(300,300);
JLabel l1=new JLabel("Enter no1=");
JLabel l2=new JLabel("Enter no2=");
b1=new JButton("Add");
jtf1=new JTextField(8);
jtf2=new JTextField(8);
jtf3=new JTextField(8);
add(l1);
add(jtf1);
add(l2);
add(jtf2);
add(b1);
add(jtf3);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int n1=Integer.parseInt(jtf1.getText());
int n2=Integer.parseInt(jtf2.getText());
jtf3.setText(Integer.toString(n1+n2));
}
public static void main(String args[])
{
new addition();
}
}