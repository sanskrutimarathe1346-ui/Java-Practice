import java.util.Scanner;
public class number
{
    public static void main(String args[])
    {
        int i,no,co=0,rem,n,rev=0,flag=1,n1;
        long fact=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number=");
       no=sc.nextInt();
       n1=n=no;
       System.out.println("Digits=");
        while(no!=0)
        {
            rem=no%10;           //digits
            System.out.println("  "+rem); //display digits
            co++;                           //count digits
            rev=rev*10+rem;                  // calculate reversed 
            no=no/10;                       // no less by one digit
        }
        System.out.println("Number of digits="+co);
        System.out.println("reversed no="+rev);
        
        if(n==rev) // check whether palindrome
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("number is not palindrome");
        }
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("NUmber is prime");
        }
        else
        {
            System.out.println("NUmber is not prime");
        }
        
         for(i=n1;i>=1;i--)
         {
            fact=fact*i;
         }
         System.out.println("Factorial="+fact);

    }
}