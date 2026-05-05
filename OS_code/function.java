import java.util.*;
public class function
{
public static int calsum(int a,int b) //addition
{
    int sum=a+b;
    return sum;
}
public static int calprod(int a,int b) //product
{
    int prod=a*b;
    return prod;
}
public static int fact(int a) //factorial
{
    int fact=1;
    for(int i=1;i<=a;i++)   //for(int i=1;i<=a;i++) (int i=a;i>=1;i--) 
    {
        fact=fact*i;
    }
    return fact;
}
public static void checkprime(int n)  // check prime
{
    int flag=0;
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        flag=1;
    }
    if(flag==0)
    {
        System.out.println("Number "+n+ "is prime");
    }
    else
    {
        System.out.println("Number is not prime");

    }
}
public static void checkeven(int n)   //check even
{
      if(n%2==0)
      { 
        System.out.println(n +" is even");
       }
       
}
public static void table(int n) //print table
{
    for(int i=1;i<=10;i++)
    {
        System.out.println(" "+n+"*"+i+"="+n*i);
    }
}

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       /*  int b=sc.nextInt();
        
        System.out.println("Sum="+calsum(a,b));
        System.out.println("Product="+calprod(a,b));
        System.out.println("Factorial of "+a+"is="+fact(a));
        checkprime(a);
        checkeven(a); */
        table(a);
        
    }
}