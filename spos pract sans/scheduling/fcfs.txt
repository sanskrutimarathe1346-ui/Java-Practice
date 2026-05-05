import java.util.Scanner;

public class FCFS
{

	public static void main(String[] args) 

	{

		Scanner sc=new Scanner(System.in);

		System.out.println("How many processes you want to schedule?");

		int n=sc.nextInt();

		int temp;
		float totaltat=0,totalwt=0;

		int[] pid = new int[n]; 
		int[] AT = new int[n];
		int[] BT = new int[n];
		int[] CT = new int[n];
		int[] TAT = new int[n];
		int[] WT = new int[n];
        
		for(int i=0;i<n;i++)

		{
			System.out.println("Enter process id");
			pid[i]=sc.nextInt();
			System.out.println("Enter process Arrival time");
			AT[i]=sc.nextInt();
			System.out.println("Enter process Burst time");
			BT[i]=sc.nextInt();	
		}

		for(int i=0;i<n-1;i++)
		{
		  for(int j=i+1;j<n;j++)  
		  {
			  if(AT[i]>AT[j])
			  {
				 temp=AT[i];
				 AT[i]=AT[j];
				 AT[j]=temp;
			 
				 temp=pid[i];
				 pid[i]=pid[j];
				 pid[j]=temp;
				 
				 temp=BT[i];
				 BT[i]=BT[j];
				 BT[j]=temp;	 
			  }
		  }
		}

		System.out.println("Pid"+"\t"+"AT"+"\t"+"BT");

        for(int i=0;i<n;i++)
        {
            System.out.println(pid[i]+"\t"+AT[i]+"\t"+BT[i]);
         }

		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				CT[i]=AT[i]+BT[i];
			}
			else
			{
				if(CT[i-1]<AT[i])
				{
					CT[i]=AT[i]+BT[i];
				}
				else
				{
					CT[i]=CT[i-1]+BT[i];
				}
			}
           TAT[i]=CT[i]-AT[i];
			totaltat+=TAT[i];
            WT[i]=TAT[i]-BT[i];
			totalwt+=WT[i];
		}
		System.out.println("------------------------------------------------------");


        System.out.println("Pid"+"\t"+"AT"+"\t"+"BT"+"\t"+"CT"+"\t"+"TAT"+"\t"+"WT");

        for(int i=0;i<n;i++)
        {
            System.out.println(pid[i]+"\t"+AT[i]+"\t"+BT[i]+"\t"+CT[i]+"\t"+TAT[i]+"\t"+WT[i]);
         }

		System.out.println("Average TAT="+(totaltat/n));
		System.out.println("Average WT="+(totalwt/n));

	}

}