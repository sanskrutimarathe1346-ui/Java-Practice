import java.util.Scanner;
public class addition 
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,sum=0;
      for(i=1;i<=5;i++)
      {
        System.out.println("enter a number=");
        n=sc.nextInt();
        sum=sum+n;
      }
      System.out.println("Sum="+sum);
    }
}

