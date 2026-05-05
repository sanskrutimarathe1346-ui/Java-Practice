import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="clicks" width=300 height=300></applet>*/
public class clicks extends Applet implements MouseListener
{
int cnt=0;
public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
cnt++;
showStatus("clicks"+cnt);
}
public void mouseEntered(MouseEvent me) {}
public void mouseExited(MouseEvent me) {}
public void mousePressed(MouseEvent me) {}
public void mouseReleased(MouseEvent me) {}
}

