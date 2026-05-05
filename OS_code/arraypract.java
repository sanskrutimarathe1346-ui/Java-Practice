import java.util.*;

public class arraypract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    /*   System.out.println("enter no of names=");
         int size=sc.nextInt();
        String[] names=new String[size];

      for(int i=0;i<size;i++)                // Take an array of names as input from the user and print them on the screen.
      {
        System.out.println("enter name=");
        names[i]=sc.next();
      }
      for(int i=0;i<size;i++)
      {
        System.out.println(" name="+names[i]);
      } 

     
      System.out.println("enter no of input=");    
         int size=sc.nextInt();
         int[] numbers=new int[size];

         for(int i=0;i<size;i++)
         {
            System.out.println("enter=");
            numbers[i]=sc.nextInt();
         }

         /* 

         int min=numbers[0];                      //Find the maximum & minimum number in an array of integers.
         int max=numbers[0];

         for(int i=0;i<numbers.length;i++)
         {
            if(numbers[i]<min)
            {
                min=numbers[i];
            }
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
         }

         System.out.println("MAX="+max+"   "+"MIN="+min);
        
        boolean asc=true;        // Take an array of numbers as input and check if it is an array sorted in ascending order.


        for(int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i]>numbers[i+1])
            {
                asc=false;
            }
        }
        if(asc)
        {
            System.out.println("ascending");
        }
        else{
            System.out.println("decending");

        }  */

        System.out.println("Enter rows=");
        int rows=sc.nextInt();
        System.out.println("Enter columns=");
        int cols=sc.nextInt();
        int[][] nos=new int[rows][cols];

        for(int i=0;i<rows;i++)          //input
        {
            for(int j=0;j<cols;j++)
            {
                nos[i][j]=sc.nextInt();
            }
        }
        
        /*
         for(int i=0;i<rows;i++)              //print
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("   "+nos[i][j]);
            }
        System.out.println();
        } 
            
        
        System.out.println("enter no to search=");
        int x=sc.nextInt();

         for(int i=0;i<rows;i++)              //search
        {
            for(int j=0;j<cols;j++)
            {
                if(nos[i][j]==x)
                 {
                    System.out.println("Found at "+i+"th location and "+j+"th column");
                    break;
                 }
            }
        
        } */

        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print("   "+nos[j][i]);
            }
            System.out.println();
        }

        


    }
}