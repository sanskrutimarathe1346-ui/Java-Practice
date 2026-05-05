import java.util.Scanner;
class Pizza
{
String name,size;
int price;

Pizza()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name,size & price of pizza=");
name=sc.next();
size=sc.next();
price=sc.nextInt();
}
Pizza(String name,String size,int price)
{
this.name=name;
this.size=size;
this.price=price;
}
Pizza(Pizza p)
{
name=p.name;
size=p.size;
price=p.price;
}
void show()
{
System.out.println("----------------------------");
System.out.println("NAME=  "+name);
System.out.println("SIZE=  "+size);
System.out.println("PRICE=  "+price);
}
}
 class AAA
{
public static void main(String args[])
{
Pizza p1=new Pizza();
Pizza p2=new Pizza("corn pizza","medium",179);
Pizza p3=new Pizza(p1);
p1.show();
p2.show();
p3.show();
}
}

