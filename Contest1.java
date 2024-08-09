import java.util.Scanner;

public class Contest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n and k
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Read scores
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        // k-th place score
        int kthPlaceScore = scores[k - 1];
        
        // Count participants who advance to the next round
        int count = 0;
        for (int score : scores) {
            if (score >= kthPlaceScore && score > 0) {
                count++;
            }
        }
        
        // Output the number of participants who advance
        System.out.println(count);
    }
}
