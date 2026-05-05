import java.awt.*;
import java.applet.*;
/*<applet code="border.class"  height=300 width=300> </applet>*/
public class border extends Applet
{
public void init()
{
BorderLayout B1=new BorderLayout();
Button b1=new Button("North");
Button b2=new Button("West");
Button b3=new Button("East");
Button b4=new Button("South");
Button b5=new Button("Center");
setLayout(B1);
add(b1,BorderLayout.NORTH);
 add(b2,BorderLayout.WEST);
add(b3,BorderLayout.EAST);
add(b4,BorderLayout.SOUTH);
add(b5,BorderLayout.CENTER);
}
}