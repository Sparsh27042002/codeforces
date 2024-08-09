import java.util.*;
public class soldier
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        int sum=0;
        for(int i=1;i<=o;i++)
        {
            sum=sum+i*n;
        }
        if(sum<=m)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(sum-m);
        }
    }
}