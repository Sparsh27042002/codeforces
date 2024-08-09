import java.util.*;
public class books
{
    public void cal()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result[]=new int[n];
        
        while(n!=0)
        {
            int max=0;
            int no=sc.nextInt();
            for(int i=0;i<no-1;i++)
            {
                int m=sc.nextInt();
                max=Math.max(max,m);
            }
            int q=sc.nextInt();
            System.out.println(q+max);
            n--;
        }
    }
    public static void main(String args[])
    {
        books ob=new books();
        ob.cal();
    }
}