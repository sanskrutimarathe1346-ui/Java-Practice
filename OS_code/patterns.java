import java.util.*;
class patterns
{
    public static void main(String args[])
    {
        // solid rectangle
     // int n=4;
       // int m=5;
        /*Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=1;i<=n;i++)  //rows
        {
            System.out.println(" ");
            for(int j=1;j<=m;j++)     //column
            {
            System.out.print("*");
            }
        }
            // hollow rectangle
        for(int i=1;i<=n;i++)
        {
            System.out.println();
            for(int j=1;j<=m;j++)
            {
                if(i==1 || j==1 || i==n ||j==m)
                {
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
             }
        }*/
        /*  half pyramid
        for(int i=1;i<=n;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        } */
       // inverted half pyramid
   /*  for(int i=n;i>=1;i--)
    {
         System.out.println();
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
    } */
    
   
   //mirror of half pyramid
   /*for(int i=1;i<=n;i++)
   {
    System.out.println();
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }*/
    //half pyramid of numbers
   /* for(int i=1;i<=5;i++)
    {
        System.out.println();
        for(int j=1;j<=i;j++)
        {
            System.out.print(" "+j);

        }
    }*/
    //inverted half pyramid of numbers
    /*  int n=5;
     for(int i=1;i<=n;i++)
    {
        System.out.println();
        for(int j=1;j<=n-i+1;j++)
        {
            System.out.print(" "+j);
        }
    } 
        
    //second option
    for(int i=n;i>=1;i--)
    {
         System.out.println();
        for(int j=1;j<=i;j++)
        {
            System.out.print(" "+j);
        }
    }*/
    //floyd's triangle
  /*  int n=5;
    int num=1;
    for(int i=1;i<=n;i++)
    {
        System.out.println();
        for(int j=1;j<=i;j++)
        {
            System.out.print(" "+num);
            num++;

        }
    } */
   // half pyramid of 0&1
  /*  int n=5;
   for(int i=1;i<=n;i++)
   {
    System.out.println();
    for(int j=1;j<=i;j++)
    {
        
        
        if((i+j)%2==0)
        {
            System.out.print("1 ");
        }
        else{
            System.out.print("0 ");
        }

    }
   }*/
  // solid rhombus
 /*  int n=5,sp1;
  for(int i=1;i<=n;i++)
  {
    System.out.println();
    for(sp1=1;sp1<=n-i;sp1++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=5;j++)
    {
        System.out.print("  *");  
    }
 }*/
 //number pyramid
 int n=5;
 for(int i=1;i<=n;i++)
 {
    System.out.println();
    for(int j=1; j<=n-i; j++) {
        System.out.print(" ");
    }

    for(int j=1;j<=i;j++)
    {
        System.out.print(" "+i);
        
    }
 }

    
}
 }




