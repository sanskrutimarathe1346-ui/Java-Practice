import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="motion" width=300 height=300></applet>*/
public class motion extends Applet implements MouseMotionListener
{
public void init()
{
addMouseMotionListener(this);
}
public void mouseDragged(MouseEvent me)
{
showStatus("Mouse Dragged"); 
}
public void mouseMoved(MouseEvent me)
{
showStatus("Mouse Moved");
}
}