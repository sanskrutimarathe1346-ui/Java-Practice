import java.awt.*;
import java.awt.event.*;
public class multiply extends Frame implements ActionListener
{
Button b1;
TextField tf1,tf2;
Label l1;
public multiply()
{
setTitle("Multiplication");
setLayout(new FlowLayout());
setSize(500,500);
setVisible(true);
b1=new Button("Submit");
tf1=new TextField(5);
tf2=new TextField(5);
l1=new Label();
add(tf1);
add(tf2);
add(b1);
add(l1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int n1,n2,multiply;
n1=Integer.parseInt(tf1.getText());
n2=Integer.parseInt(tf2.getText());
multiply=n1*n2;
l1.setText(Integer.toString(multiply));
}
public static void main(String args[])
{
new multiply();
}
}

