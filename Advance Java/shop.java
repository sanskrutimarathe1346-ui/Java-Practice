import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class shop extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField tf1,tf2;
Button b1,b2;
List lt1,lt2;
shop()
{
setTitle("Stationary");
setLayout(new FlowLayout());
setSize(800,800);
setVisible(true);
l1=new Label("Shopping items");
l2=new Label("Qty");
l3=new Label("Selection ");
tf1=new TextField(8);
tf2=new TextField(8);
b1=new Button("Add");
b2=new Button("Total amount");
lt1=new List();
lt2=new List();
lt1.add("Pen");
lt1.add("Pencil");
lt1.add("Paper");
add(l1);
add(lt1);
add(l2);
add(tf1);
add(b1);
add(l3);
add(lt2);
add(b2);
add(tf2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int qty=0,amount=1;
String str2="";
if(ae.getSource()==b1)
{
String str=lt1.getSelectedItem()+"-"+tf1.getText();
lt2.add(str);
qty=qty+(Integer.parseInt(tf1.getText()));
amount=(5*qty);
str2=(Integer.toString(amount));
}
if(ae.getSource()==b2)
{
tf2.setText(str2);
}
}
public static void main(String Args[])
{
shop s1=new shop();
}
}