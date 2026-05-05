class student
{
int roll=28;
String s="sanskruti";
void shows()
{
System.out.println("Roll="+roll);
System.out.println("Name="+s);
}
}

class person extends student
{
int m1=78;
int m2=67;
void showp()
{
System.out.println("marks1="+m1);
System.out.println( "marks2="+m2);
}
}

class inh
{
public static void main(String args[])
{
person p=new person();
p.shows();
p.showp();
}
}
