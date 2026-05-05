import java.util.*;
public class functionpract
{
public static float findavg(int a,int b,int c) //q.1 Enter 3 numbers from the user & make a function to print their average.
{
    float avg=(a+b+c)/3;
    return avg;
}
public static int sumodd(int n)       //q.2 Write a function to print the sum of all odd numbers from 1 to n.
{
    int tot=0;
    for(int i=1;i<=n;i++)
    {
        if(i%2!=0)
        {
            tot+=i;
        }
    }
    return tot;

}

public static int greatOfTwo(int a,int b)   //q.3 Write a function which takes in 2 numbers and returns the greater of those two.
{
    if(a>b)
     return a;
    else
     return b;
}
public static double circum(int r)  //q.4 Write a function that takes in the radius as input and returns the circumference of a circle.
{
       double circum=2*Math.PI*r;
       return circum;
}
public static void votecheck(int age)  //q.5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
{
    if(age>18)
      System.out.println("Eligible to vote");
    else
     System.out.println("Not Eligible to vote");
}

public static int expo(int a,int b)
{ 
    int ex=1;
    for(int i=1;i<=b;i++)
    {
       ex=ex*a;
    }
    return ex;
}

    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

        /*int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int pos=0,neg=0,z=0;
      
        System.out.println("Average of 3 nos="+findavg(a,b,c));
        System.out.println("Sum of all odd nos="+sumodd(a));  
        System.out.println("Greatest of two="+greatOfTwo(a,b)); 
        System.out.println("Circumference of circle="+circum(a)); 
        votecheck(a); 

        do{
            
            System.out.println("i");       // q.6 Write an infinite loop using do while condition.

        }while(true);
        */


       /*  System.out.println("Enter no of inputs you want to give="); //q.7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int input=sc.nextInt();
            if(input>0)
             pos++;
            else if(input<0)
             neg++;
            else 
             z++;    
        }
        System.out.println("Positive="+pos+"\t"+"Negative="+neg+"\t"+"Zeros="+z);
        

        System.out.println("Exponential="+expo(a,b));
        

        int n=greatOfTwo(a,b);  //q.9 Write a function that calculates the Greatest Common Divisor of 2 numbers.
        int max=1;
        for(int i=1;i<=n;i++)
        {
            if(a%i==0 && b%i==0)
            { 
                if(i>max)
                {
                    max=i;
                }

            }
        }
        System.out.println("GCD="+max);
        */
        int fs=0,ss=1;                                     //q.10 print Fibonacci series of n terms
        System.out.println("Enter no of terms=");
        int n=sc.nextInt();

        System.out.print("   "+fs+"   "+ss);

        for(int i=3;i<=n;i++)
        {
            int ts=fs+ss;
            System.out.print("    "+ts);
            fs=ss;
            ss=ts;

        }



        





    }
}