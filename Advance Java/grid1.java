/*<applet code="grid1.class"  height=300 width=300> </applet>*/
import java.awt.*;
import java.applet.*;
public class grid1 extends Applet
{
static final int n=5;
public void init()
{
GridLayout g1=new GridLayout(5,5);
setLayout(g1);
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
int k=i*n+j;
if(k>0)
{
add(new Button(" "+k));
}
}
}
}
}


