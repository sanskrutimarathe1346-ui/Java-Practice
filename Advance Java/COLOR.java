import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class COLOR extends Frame implements AdjustmentListener
{
SScrollbar s1,s2,s3;
Button b1;
COLOR()
{
setTitle("component demo");
setLayout(new FlowLayout());
setSize(800,800);
setVisible(true);
s1=new Scrollbar(Scrollbar.VERTICAL); 
s2=new Scrollbar(Scrollbar.VERTICAL); 
s3=new Scrollbar(Scrollbar.VERTICAL); 
b1=new Button();
add(s1);
add(s2);
add(s3);
add(b1);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);
s3.addAdjustmentListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent ae)
{
int cr=0;
int cg=0;
int cb=0;
if(ae.getSource()==s1)
cr=ae.getValue();
else if(ae.getSource==s2)
cg=ae.getValue();
else if(ae.getSource==s3)
cb=ae.getValue();
b1.setBackground(new Color(cr,cg,cb));
}
public static void main(String args[])
{
new COLOR();
}
}