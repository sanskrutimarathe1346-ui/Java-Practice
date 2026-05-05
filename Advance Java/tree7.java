import java.awt.*;
import javax.swing.*;
import  javax.swing.tree.*;
/*<applet code="tree7.class" width=500 height=500></applet>*/
public class tree7 extends JApplet
{
public void init()
{
Container contentpane=getContentPane();
contentpane.setLayout(new BorderLayout());
DefaultMutableTreeNode top=new DefaultMutableTreeNode("India");
DefaultMutableTreeNode s1=new DefaultMutableTreeNode("Maharashtra");
DefaultMutableTreeNode s2=new DefaultMutableTreeNode("Gujrath");
DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Mumbai");
DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Pune");
DefaultMutableTreeNode c3=new DefaultMutableTreeNode("Nashik");
DefaultMutableTreeNode c4=new DefaultMutableTreeNode("Nagpur");
top.add(s1);
top.add(s2);
s1.add(c1);
s1.add(c2);
s1.add(c3);
s1.add(c4);
JTree tree=new JTree(top);
JScrollPane jsp=new JScrollPane(tree);
add(jsp,BorderLayout.CENTER); 
}
}


 