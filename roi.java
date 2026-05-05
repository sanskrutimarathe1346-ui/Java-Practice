abstract class Bank
{
abstract int groi();
}
class sbi extends Bank
{
int groi()
{return 9;} 
}
class icici extends Bank
{
int groi()
{return 7;} 
}
class axis extends Bank
{
int groi()
{return 6;} 
}

class roi
{
public static void main(String args[])
{
axis a=new axis();
sbi s=new sbi();
icici i=new icici();

System.out.println("AXIS="+a.groi());
System.out.println("SBI="+s.groi());
System.out.println("ICICI="+i.groi());
}
}
