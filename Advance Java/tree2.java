import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
/*<applet code="tree2.class" width=500 height=500></applet>*/
public class tree2 extends JApplet
{
public void init()
{
Container contentpane=getContentPane();
contentpane.setLayout(new BorderLayout());
DefaultMutableTreeNode top,c,d,html,pf,ajp,css;
top=new DefaultMutableTreeNode("Drive");
c=new DefaultMutableTreeNode("C:");
d=new DefaultMutableTreeNode("D:");
html=new DefaultMutableTreeNode("HTML");
pf=new DefaultMutableTreeNode("Program Files");
ajp=new DefaultMutableTreeNode("AJP");
css=new DefaultMutableTreeNode("CSS");
top.add(c);
top.add(d);
c.add(html);
c.add(pf);
d.add(ajp);
d.add(css);
JTree tree=new JTree(top);
JScrollPane jsp=new JScrollPane(tree);
add(jsp,BorderLayout.CENTER);
}
}

