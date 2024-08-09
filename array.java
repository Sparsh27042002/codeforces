import java.util.*;
public class array
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        // Iterate over each test case
        for (int testCase = 0; testCase < t; testCase++) 
        {
            // Read the size of the array for this test case
            int n = sc.nextInt();
            
            // Initialize the array with the value of n
            int[] beautifulArray = new int[n];
            for (int i = 0; i < n; i++) 
            {
                beautifulArray[i] = n;
            }
            
            // Print the array
            for (int i = 0; i < n; i++) 
            {
                System.out.print(beautifulArray[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

   