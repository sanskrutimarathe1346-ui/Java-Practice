import java.util.Scanner;

public class sjf2

{

	public static void main(String[] args) 

	{

		Scanner sc=new Scanner(System.in);

		System.out.println("How many processes you want to schedule?");

		int n=sc.nextInt();

		int temp,min;
		float totaltat=0,totalwt=0;
        int total=0,st=0,c=0;

		int[] pid = new int[n]; 

		int[] AT = new int[n];

		int[] BT = new int[n];
		int[] BT2 = new int[n];

		int[] CT = new int[n];

		int[] TAT = new int[n];

		int[] WT = new int[n];

        int[] flag = new int[n];

		for(int i=0;i<n;i++)

		{

			System.out.println("Enter process id");

			pid[i]=sc.nextInt();

			System.out.println("Enter process Arrival time");

			AT[i]=sc.nextInt();

			System.out.println("Enter process Burst time");

			BT[i]=sc.nextInt();	
			BT2[i]=BT[i];	
			

		}

        while(true)
        {
            c=n;
            min=99;
            if(total==n)
            {
                break;
            }
            for(int i=0;i<n;i++)
            {
                if(AT[i]<=st && flag[i]==0 && BT[i]<min)
                {
                    min=BT[i];
                    c=i;
                }
            }
            if(c==n)
            {
                st++;
            }
            else
            {
                BT[c]--;
                st++;
                if(BT[c]==0)
                {
                    flag[c]=1;
                    CT[c]=st;
                    total++;
                   TAT[c]=CT[c]-AT[c];
			         totaltat+=TAT[c];
                   WT[c]=TAT[c]-BT2[c];
			        totalwt+=WT[c];

                }
            }
        }

         System.out.println("Pid"+"\t"+"AT"+"\t"+"BT"+"\t"+"CT"+"\t"+"TAT"+"\t"+"WT");

        for(int i=0;i<n;i++)
        {
            System.out.println(pid[i]+"\t"+AT[i]+"\t"+BT2[i]+"\t"+CT[i]+"\t"+TAT[i]+"\t"+WT[i]);

           
        }

		System.out.println("Average TAT="+(totaltat/n));
		System.out.println("Average WT="+(totalwt/n));
    }
}   