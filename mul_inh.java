import java.util.*;
class college
{
int coll_id=56;
String coll_name="PCP";

void display1()
{
System.out.println("ID="+coll_id);
System.out.println("NAME="+coll_name);
}
}

class student extends college
{
int roll=72;
String name="SANSKRUTI";

void display2()
{
System.out.println("ROLL="+roll);
System.out.println("STUDENT NAME="+name);
}
}

class marks extends student
{
int m1=70;
int m2=69;
void display3()
{
display1();
display2();
System.out.println("MARKS1="+m1);
System.out.println("MARKS2="+m2);
System.out.println("total="+(m1+m2));
}
}

class mul_inh
{
public static void main(String args[])
{
marks m=new marks();
m.display3();
}
}

