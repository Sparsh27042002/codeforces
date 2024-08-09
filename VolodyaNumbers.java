import java.util.Scanner;

public class VolodyaNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input values
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        // Calculate the number of odd numbers
        long oddCount = (n + 1) / 2;
        
        if (k <= oddCount) {
            // k-th number is an odd number
            System.out.println(2 * k - 1);
        } else {
            // k-th number is an even number
            System.out.println(2 * (k - oddCount));
        }
        
        sc.close();
    }
}
