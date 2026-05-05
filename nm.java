import java.util.*;
class first
{
int i,j;
first()
{
i=2;
j=3;
}
void display()
{
System.out.println("i="+i+"j="+j);
}
}
class second extends first
{
int p;
second()
{
super();
p=5;
}
void display()
{
super.display();
System.out.println("p="+p);
}
}

class nm
{
public static void main(String args[])
{
second sc=new second();
sc.display();
}
}