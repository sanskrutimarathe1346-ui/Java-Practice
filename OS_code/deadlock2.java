import java.util.*;
public class deadlock2 
{
    public static void main(String[] args)
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of processes=");
        n=sc.nextInt();
        System.out.println("Enter no of resources=");
        m=sc.nextInt();

        int[][] max=new int[n][m];

        int[][] allocation=new int[n][m];

        int[][] need=new int[n][m];

        int[] available=new int[m];

        boolean[] finished=new boolean[n];

        System.out.println("Enter max resources=");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                max[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter allocated resources=");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                allocation[i][j]=sc.nextInt();
        
            }
        }

        System.out.println("Enter available resources=");
        for(int i=0;i<m;i++)
        {
            available[i]=nextInt();
        }
        // need matrix

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                need[i][j]=max[i][j]-allocation[i][j];
            }
        }
        System.out.println("----------Executing processes-------------------");

        int exec=0;
        while(exec!=n)
        {
            for(int i=0;i<n;i++)
            {
                
                if(!finished[i])
                {
                   boolean canexec=true;
                   for(int j=0;j<m;j++)
                   {
                    if(need[i][j] > available[j])
                    {
                          canexec=false;
                          break;
                    }
                   }

                   if(exec)
                   {
                    System.out.println("Process "+ i +"is executing");
                    for(j=0;j<m;j++)
                    {
                        available[j]=available[j]+allocation[i][j];
                    }
                    finished[i]=true;
                    exec++;
                   }

                }
            }
            System.out.println("Available resorces=");
            for(int j=0;j<m;j++)
            {
                System.out.print(" "+available[j]);
            }
            System.out.println();
        }

        System.out.println("Max matrix=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("  "+max[i][j]);
            }
            System.out.println();
        }

        System.out.println("Allocation matrix=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("  "+allocation[i][j]);
            }
            System.out.println();
        }

        System.out.println("need matrix=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("  "+need[i][j]);
            }
            System.out.println();
        }
        sc.close();




    }
    
    
}
