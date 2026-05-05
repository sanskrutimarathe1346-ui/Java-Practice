import java.awt.*;
import javax.swing.*;
/*<applet code="JCOMBO.class" width=500 height=500></applet>*/
public class JCOMBO extends JApplet
{
String str;
public void init()
{
FlowLayout f1=new FlowLayout();
Container contentpane=getContentPane();
contentpane.setLayout(f1);
JComboBox jc=new JComboBox();
jc.addItem("Solapur");
jc.addItem("Pune");
jc.addItem("Banglore");
jc.addItem("Mumbai");
contentpane.add(jc);
jc.setSelectedItem("Mumbai");
str=(String)jc.getSelectedItem();
}
public void paint(Graphics g)
{
g.drawString("You are in "+str,200,200);
}
}




