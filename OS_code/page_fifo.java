import java.util.Scanner;
public class Page_fifo 
{
     public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of frames: ");
        int n = sc.nextInt();


        System.out.print("Enter number of pages: ");
        int m = sc.nextInt();

        int[] ref = new int[m];
        System.out.println("Enter the reference string:");
        for (int i = 0; i < m; i++)
        {
            ref[i] = sc.nextInt();
        }
        int[] buffer=new int[n];
         for (int i = 0; i < n; i++)
        {
           buffer[i]=-1;
        }
        int[][] memLayout=new int[n][m];
         char[] mark = new char[m];
         int pointer=0,hit=0,fault=0;

         for(int i=0;i<m;i++)
         {
            int search=-1;
            for(int j=0;j<n;j++)
            {
                if(buffer[j]==ref[i])
                {
                    hit++;
                    search=j;
                    mark[i]='#';
                    break;
                }
            }
            if(search==-1)
            {
                buffer[pointer]=ref[i];
                fault++;
                pointer++;
                mark[i]='*';
                if(pointer==n)
                {
                    pointer=0;
                }
            }
            for(int j=0;j<n;j++)
            { 
                memLayout[j][i]=buffer[j];

            }
         }

         System.out.println("Reference string=");
         for(int i=0;i<m;i++)
         {
            System.out.print(ref[i]+"\t");
         }
         System.out.println();
          System.out.println("Memory Layout=");
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
                if(memLayout[i][j]==-1)
                {
                    System.out.print(" \t");
                }
                else
                {
                    System.out.print(memLayout[i][j]+"\t");
                }
            }
            System.out.println();
         }

         System.out.println("\n");
         for(int i=0;i<m;i++)
         {
            System.out.print(mark[i]+"\t");
         }
          System.out.println();

          System.out.println("Total Page Faults = " + fault);
        System.out.println("Total Hits = " + hit);

    
  }
}
