import java.util.*;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        while (n != 0) {
            int m = sc.nextInt();
            res = 0;  
            while (m != 0) {
                int rem = m % 10;
                res += rem;
                m = m / 10;
            }
            n--;
            System.out.println(res);  
        }
    }
}
