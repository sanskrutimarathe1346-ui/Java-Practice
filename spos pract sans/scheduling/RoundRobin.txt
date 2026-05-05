import java.util.Scanner;

public class RoundRobin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of processes:");
        int n = sc.nextInt();
        float totaltat=0,totalwt=0;

        int[] pid = new int[n];
        int[] AT = new int[n];
        int[] BT = new int[n];
        int[] BT2 = new int[n];
        int[] CT = new int[n];
        int[] TAT = new int[n];
        int[] WT = new int[n];
        boolean[] completed = new boolean[n];

        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter process id:");
            pid[i] = sc.nextInt();

            System.out.println("Enter Arrival time for process P" + pid[i] + ":");
            AT[i] = sc.nextInt();

            System.out.println("Enter Burst time for process P" + pid[i] + ":");
            BT[i] = sc.nextInt();
            BT2[i] = BT[i];
        }

        int time = 0, total = 0;
        boolean found;

        while (total < n) {
            found = false;

            for (int i = 0; i < n; i++) {
                if (AT[i] <= time && BT[i] > 0) {
                    found = true;

                    if (BT[i] <= tq) {
                        time += BT[i];
                        BT[i] = 0;
                        CT[i] = time;
                        completed[i] = true;
                        total++;
                    } else {
                        BT[i] -= tq;
                        time += tq;
                    }
                }
            }

            if (!found) 
            {  time++; }
        }

        for (int i = 0; i < n; i++) {
            TAT[i] = CT[i] - AT[i];
            WT[i] = TAT[i] - BT2[i];
            totaltat += TAT[i];
            totalwt += WT[i];
        }

        System.out.println("Pid"+"\t"+"AT"+"\t"+"BT"+"\t"+"CT"+"\t"+"TAT"+"\t"+"WT");

        for(int i=0;i<n;i++)
        {
            System.out.println(pid[i]+"\t"+AT[i]+"\t"+BT2[i]+"\t"+CT[i]+"\t"+TAT[i]+"\t"+WT[i]);

           
        }

       System.out.println("Average TAT="+(totaltat/n));
		System.out.println("Average WT="+(totalwt/n));


        sc.close();
    }
}
