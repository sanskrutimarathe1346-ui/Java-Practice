import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Card extends JFrame implements ActionListener
{
CardLayout card;
JButton b1,b2,b3;
Container c;
Card()
{
c=getContentPane();
card=new CardLayout(40,30);
c.setLayout(card);
b1=new JButton("Apple");
b2=new JButton("Boy");
b3=new JButton("Cat");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
c.add("a",b1);
c.add("b",b2);
c.add("c",b3);
}
public void actionPerformed(ActionEvent e)
{
card.next(c);
}
public static void main(String[] args)
{
Card c1=new Card();
c1.setSize(400,400);
c1.setVisible(true);
c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
