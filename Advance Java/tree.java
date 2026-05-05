import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
/*<applet code="tree.class" width=800 height=800></applet>*/
public class tree extends JApplet
{
public void init()
{
Container contentpane=getContentPane();
contentpane.setLayout(new BorderLayout());
DefaultMutableTreeNode top=new DefaultMutableTreeNode("options");
DefaultMutableTreeNode a=new DefaultMutableTreeNode("A");
DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
DefaultMutableTreeNode b=new DefaultMutableTreeNode("B");
DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
DefaultMutableTreeNode b3=new DefaultMutableTreeNode("B3");
top.add(a);
top.add(b);
a.add(a1);
a.add(a2);
b.add(b1);
b.add(b2);
b.add(b3);
JTree tree=new JTree(top);
JScrollPane jsp=new JScrollPane(tree); 
add(jsp,BorderLayout.CENTER);
}
}



