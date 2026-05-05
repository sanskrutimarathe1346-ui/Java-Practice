/*<applet code="A.class" width=500  height=300></applet>*/
import java.applet.Applet;
import java.awt.*;
public class A extends Applet
{
public void paint(Graphics g)
{
int xinc=0;
for(int i=1;i<=10;i++)
{

g.drawOval(100+xinc,100+xinc,1000-(xinc*2),1000-(xinc*2));

xinc=xinc+50;
}
}
}