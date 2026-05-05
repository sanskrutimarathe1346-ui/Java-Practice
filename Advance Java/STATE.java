import java.awt.*;
import javax.swing.*;
public class STATE extends JFrame
{
STATE()
{
FlowLayout f1=new FlowLayout();
Container contentpane=getContentPane();
contentpane.setLayout(f1);
JComboBox jc=new JComboBox();
jc.addItem("Maharashtra");
jc.addItem("Gujrat");
jc.addItem("Delhi");
jc.addItem("Kerla");
jc.addItem("Goa");
contentpane.add(jc);
setSize(400,400);
setVisible(true);
}
public static void main(String args[])
{
STATE s1=new STATE();
}
}


