import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class COMBINE extends Frame implements ActionListener,ItemListener
{
Label l1,l2,l3;
TextField tf1;
Button b1;
List lt;
COMBINE()
{
setTitle("component demo");
setLayout(new FlowLayout());
setSize(800,800);
setVisible(true);
l1=new Label("enter color=");
l2=new Label("select color=");
l3=new Label();
tf1=new TextField(8);
b1=new Button("OK");
lt=new List();
add(l1);	
add(tf1);
add(b1);
add(l2);
add(lt);
add(l3);
b1.addActionListener(this);
lt.addItemListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=tf1.getText();
lt.add(str);
}
public void itemStateChanged(ItemEvent ie)
{
l3.setText("selected color="+lt.getSelectedItem());
}
public static void main(String Args[])
{
COMBINE c1=new COMBINE();
}
}
 
