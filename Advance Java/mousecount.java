import java.awt.*;
import java.awt.event.*;
public class mousecount extends Frame implements MouseListener
{
Label l1;
int cnt=0;
public mousecount()
{
setVisible(true);
setLayout(new FlowLayout());
setTitle("mouse clicks");
setSize(300,300);
l1=new Label();
add(l1);
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
cnt++;
l1.setText(Integer.toString(cnt));
}
public void mouseEntered(MouseEvent me)
{}
public void mouseExited(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public static void main(String args[])
{
new clicks();
}
}