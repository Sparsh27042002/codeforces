import java.util.*;
public class elephant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=n/5;
        int rem=n%5;
        if(rem!=0)
        {
            q++;
        }
        System.out.println(q);
    }
}