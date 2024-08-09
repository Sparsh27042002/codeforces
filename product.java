import java.util.*;

public class product {
    public void calculate() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = n * 3;
        int ar[] = new int[len];
        
        for (int i = 0; i < len; i++) {
            ar[i] = sc.nextInt();
        }
        
        for (int i = 0; i < ar.length; i += 3) {
            int c = 0;
            while (c < 5) {
                if (ar[i] <= ar[i+1] && ar[i] <= ar[i+2]) {
                    ar[i]++;
                } else if (ar[i+1] <= ar[i] && ar[i+1] <= ar[i+2]) {
                    ar[i+1]++;
                } else if (ar[i+2] <= ar[i+1] && ar[i+2] <= ar[i]) {
                    ar[i+2]++;
                }
                c++;
            }
            System.out.println(ar[i] * ar[i+1] * ar[i+2]);
        }
        
        sc.close();
    }

    public static void main(String args[]) {
        product ob = new product();
        ob.calculate();
    }
}
