import java.util.*;
public class letters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int lower=0;int upper=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                upper++;
            }
            else if (ch >= 'a' && ch <= 'z')
            {
                lower++;
            }
        }
        if(upper>lower)
        {
            System.out.println(s.toUpperCase());
        }
        else
        {
            System.out.println(s.toLowerCase());
        }
    }
}