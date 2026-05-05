class sjm
{
public static void main(String args[])
{
int x,y,ans;
x=25;
y=0;

try
{
ans=x/y;

}
catch(Exception e)
{
System.out.println("exception caught");
System.out.println("divide by zero");
}

finally
{
System.out.println("Program ends!!!");
}
}
}
