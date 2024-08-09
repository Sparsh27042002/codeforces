import java.util.*;
public class Tanya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int t=sc.nextInt();
        while(t!=0)
        {
            if(n%10==0)
            {
                n=n/10;
            }
            else
            {
                n--;
            }
            t--;
        }
        System.out.println(n);
    }
}