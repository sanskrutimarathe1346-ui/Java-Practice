import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class funkey extends JFrame implements KeyListener
{
Label l1;
TextField tf1;
public funkey()
{
l1=new Label();
tf1=new TextField(10);
add(l1);
add(tf1);
tf1.addKeyListener(this);
setTitle("Key event");
setLayout(new FlowLayout());
setSize(800,800);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void keyPressed(KeyEvent e)
{
int keycode=e.getKeyCode();
if(keycode==KeyEvent.VK_ENTER)
{l1.setText("Enter key pressed");}
else if(keycode==KeyEvent.VK_F1)
{l1.setText("F1 key pressed");}
else
{
char event=e.getKeyChar();
l1.setText(event+"pressed");
}
}
public void keyReleased(KeyEvent e){ }
public void keyTyped(KeyEvent e){ }
public static void main(String args[])
{
new funkey();
}
} 