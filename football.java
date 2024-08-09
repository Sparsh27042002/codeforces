import java.util.*;
public class football
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c;
        for(int i=0;i<s.length();i++)
        {
            c=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                }
                else
                {
                    break;
                }
            }
            if(c>=7)
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}