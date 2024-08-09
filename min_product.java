import java.util.*;
public class min_product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c,pro;
        while(t>0)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            c=0;pro=0;
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                pro=ar[i]*pro;
            }
            if(pro<0)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
        }
    }
}