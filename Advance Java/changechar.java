import java.awt.*;
import javax.swing.*;
public class changechar extends JFrame 
{
public changechar()
{
setSize(300,300);
setVisible(true);
setLayout(new FlowLayout());
setTitle("Change character");
JPasswordField jp1=new JPasswordField(8);
jp1.setEchoChar('#');
add(jp1);
}
public static void main(String args[])
{
new changechar();
}
}

