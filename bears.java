import java.util.*;
public class bears
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        while(n<=m)
        {
            n*=3;
            m*=2;
            c++;
        }
        System.out.println(c);
    }
}