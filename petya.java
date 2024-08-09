import java.util.*;
public class petya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int n=0;
        for(int i=0;i<s1.length();i++)
        {
            n=s1.charAt(i)-s2.charAt(i);
            if(n>0)
            {
                System.out.println("1");
                return;
            }
            if(n<0)
            {
                System.out.println("-1");
                return;
            }
        }
        System.out.println("0");
    }
}