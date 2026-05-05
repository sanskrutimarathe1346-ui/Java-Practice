import java.awt.*;
import javax.swing.*;
/*<applet code="app.class" width=250 height=250></applet>*/
public class app extends JApplet
{
public void init()
{
Container contentpane=getContentPane();
contentpane.setLayout(new FlowLayout());
JPanel pl=new JPanel();
pl.setLayout(new GridLayout(2,2,10,5)); 
JLabel l1=new JLabel("Advance Java Online Exam");
JLabel l2=new JLabel("Time:");
JLabel l3=new JLabel("Question no:");
JLabel l4=new JLabel("Question");
pl.add(l1);
pl.add(l2);
pl.add(l3);
pl.add(l4);
JPanel pr=new JPanel();
pr.setLayout(new GridLayout(2,2,5,5)); 
JRadioButton op1=new JRadioButton("Option 1");
JRadioButton op2=new JRadioButton("Option 2");
JRadioButton op3=new JRadioButton("Option 3");
JRadioButton op4=new JRadioButton("Option 4");
ButtonGroup bg=new ButtonGroup();
bg.add(op1);
bg.add(op2);
bg.add(op3);
bg.add(op4);
pr.add(op1);
pr.add(op2);
pr.add(op3);
pr.add(op4);
JPanel pb=new JPanel();
pb.setLayout(new GridLayout(2,2,5,5)); 
JButton b1=new JButton("Submit");
JButton b2=new JButton("Exit");
JButton b3=new JButton("Back");
JButton b4=new JButton("Next");
pb.add(b1);
pb.add(b2);
pb.add(b3);
pb.add(b4);
contentpane.add(pl);
contentpane.add(pr);
contentpane.add(pb);
}
}







