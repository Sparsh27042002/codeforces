import java.util.*;
public class Sasha
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int res;
        while(t!=0)
        {
            res=0;
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            Arrays.sort(ar);
            for(int i=1;i<n;i++)
            {
                res+=ar[i]-ar[i-1];
            }
            System.out.println(res);
            t--;
        }
    }
}