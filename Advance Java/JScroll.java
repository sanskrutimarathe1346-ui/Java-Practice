import javax.swing.*;
import java.awt.*;
/*<applet code="JScroll.class" width=500 height=500></applet>*/
public class JScroll extends JApplet
{
public void init()
{
Container contentpane=getContentPane();
JPanel JP=new JPanel();
JP.setLayout(new GridLayout(10,10));
int b=0;
for(int i=0;i<10;i++)
{
for(int j=0;j<10;j++)
{
JP.add(new JButton("Button"+b));
++b;
}
}
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp=new JScrollPane(JP,v,h);
add(jsp,BorderLayout.CENTER);
}
}