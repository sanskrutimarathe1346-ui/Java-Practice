import java. awt.*;
public class MENU extends Frame
{
MENU()
{
MenuBar mb=new MenuBar();
Menu color=new Menu("Colour");
Menu fruit=new Menu("Fruits");
MenuItem c1,c2,c3,c4,f1,f2,f3,f4;
c1=new MenuItem("RED");
c2=new MenuItem("PINK");
c3=new MenuItem("PURPLE");
c4=new MenuItem("BLACK");
f1=new MenuItem("MANGO");
f2=new MenuItem("CHERRY");
f3=new MenuItem("BANANA");
f4=new MenuItem("GUAVA");
color.add(c1);
color.add(c2);
color.add(c3);
color.add(c4);
fruit.add(f1);
fruit.add(f2);
fruit.add(f3);
fruit.add(f4);
c4.setEnabled(false);
mb.add(color);
mb.add(fruit);
setMenuBar(mb);
setSize(400,400);
setLayout(null);  
setVisible(true);
}
public static void main(String args[])
{
MENU m=new MENU();
}
}
 