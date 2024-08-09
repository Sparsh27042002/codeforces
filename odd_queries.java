import java.util.*;

public class odd_queries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int ar[] = new int[n];
            int originalSum = 0;

            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
                originalSum += ar[i];
            }

            while (q > 0) {
                int r1 = sc.nextInt();
                int r2 = sc.nextInt();
                int replace = sc.nextInt();
                
                int rangeSum = 0;
                for (int i = r1 - 1; i <= r2 - 1; i++) {
                    rangeSum += ar[i];
                }

                int newRangeSum = replace * (r2 - r1 + 1);
                int newSum = originalSum - rangeSum + newRangeSum;

                if (newSum % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                
                q--;
            }
            t--;
        }
        sc.close();
    }
}
