import java.util.*;
public class placement1   //first fit
{
    public static void main(String args[])
    {
        int np,nb,total=0,sumofblock=0;
        float mem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of jobs=");
	    np=sc.nextInt();
	    System.out.println("enter no of blocks=");
        nb=sc.nextInt();
        int[] job=new int[np];
        int[] block=new int[nb];
        int[] allocation=new int[nb];
        
       System.out.println("enter size of jobs=");
	   
        for(int i=0;i<np;i++)
        {
            System.out.print("J"+i+"=");
            job[i]=sc.nextInt();
            
        }
        System.out.print("enter size of blocks=");
	   
        for(int i=0;i<nb;i++)
        {
            System.out.print("S"+i+"=");
            block[i]=sc.nextInt();
            sumofblock+=block[i];

        }
    
        for(int i=0;i<np;i++)
        {
            for(int j=0;j<nb;j++)
            {
                if(job[i]<=block[j] && allocation[j]==0)
                {
                    allocation[j]=1;
                    total+=job[i];
                    System.out.println("J"+i+" with size "+job[i]+" fitted in block "+block[j]);
                    break;
                }

            }
            
        }
        System.out.println(total + " " + sumofblock);
        mem=(float)(total)/(float)(sumofblock);

        System.out.println("Total memory percentage utilized="+(mem*100)+"%");


    }
}