class ThrowDemo
{
public static void main(String args[])
{
int x = 10, y = 20;
int z;
z = x + y;
try
{
throw new Exception();
}
catch(Exception e)
{
System.out.println("Exception caught");
System.out.println("Addition: "+z);
}
}
}