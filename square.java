import java.util.*;
public class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextInt();
        long n=sc.nextInt();
        long a=sc.nextInt();
        long x=(long)Math.ceil((double)n/a);
        long y=(long)Math.ceil((double)m/a);
        System.out.println(x*y);
    }
}