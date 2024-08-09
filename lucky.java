import java.util.*;
public class lucky
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        boolean b=false;
        int c=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='4' || s.charAt(i)=='7')
            {
                c++;
            }
        }
        if( c==4 || c==7)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}