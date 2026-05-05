import java.awt.*;
import java.applet.*;
/*<applet code="grid2.class"  height=300 width=300> </applet>*/
public class grid2 extends Applet
{
public void init()
{
Button b1=new Button("0");
Button b2=new Button("1");
Button b3=new Button("2");
Button b4=new Button("3");
Button b5=new Button("4");
Button b6=new Button("5");
Button b7=new Button("6");
Button b8=new Button("7");
Button b9=new Button("8");
Button b10=new Button("9");
GridLayout g1=new GridLayout(2,3);
setLayout(g1);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
}