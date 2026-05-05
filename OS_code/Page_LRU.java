import java.util.Scanner;

public class Page_LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of frames: ");
        int n = sc.nextInt();

        System.out.print("Enter number of pages: ");
        int m = sc.nextInt();

        int[] ref = new int[m];
        System.out.println("Enter the reference string:");
        for (int i = 0; i < m; i++) {
            ref[i] = sc.nextInt();
        }

        int[] buffer = new int[n];
        for (int i = 0; i < n; i++) buffer[i] = -1;

        int[][] memLayout = new int[n][m];
        char[] mark = new char[m];

        int hit = 0, fault = 0;

        for (int i = 0; i < m; i++) {
            int search = -1;

            for (int j = 0; j < n; j++) {
                if (buffer[j] == ref[i]) {
                    hit++;
                    search = j;
                    mark[i] = '#';
                    break;
                }
            }

            if (search == -1) {
                fault++;
                mark[i] = '*';

                int replaceIndex = -1;

                for (int j = 0; j < n; j++) {
                    if (buffer[j] == -1) {
                        replaceIndex = j;
                        break;
                    }
                }
                if (replaceIndex == -1) {
                    int leastRecent = i;
                    for (int j = 0; j < n; j++) {
                        int lastUsed = -1;
                        for (int k = i - 1; k >= 0; k--) {
                            if (ref[k] == buffer[j]) {
                                lastUsed = k;
                                break;
                            }
                        }
                        if (lastUsed < leastRecent) {
                            leastRecent = lastUsed;
                            replaceIndex = j;
                        }
                    }
                }

     
                buffer[replaceIndex] = ref[i];
            }

     
            for (int j = 0; j < n; j++) {
                memLayout[j][i] = buffer[j];
            }
        }

        System.out.println("Reference string=");
        for (int i = 0; i < m; i++) {
            System.out.print(ref[i] + "\t");
        }
        System.out.println();

        System.out.println("Memory Layout=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (memLayout[i][j] == -1) System.out.print(" \t");
                else System.out.print(memLayout[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(mark[i] + "\t");
        }
        System.out.println();

        System.out.println("Total Page Faults = " + fault);
        System.out.println("Total Hits = " + hit);
    }
}

