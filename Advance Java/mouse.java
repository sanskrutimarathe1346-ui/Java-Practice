import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="mouse" width=300 height=300></applet>*/
public class mouse extends Applet implements MouseListener
{
public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
setBackground(Color.black);
}
public void mouseEntered(MouseEvent me)
{
setBackground(Color.red);
}
public void mouseExited(MouseEvent me)
{
setBackground(Color.blue);
}
public void mousePressed(MouseEvent me)
{
setBackground(Color.pink);
}
public void mouseReleased(MouseEvent me)
{
setBackground(Color.yellow);
}
}