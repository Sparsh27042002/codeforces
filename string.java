import java .util.*;
public class string
{
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String ar[]=new String[n];
        for(int x=0;x<=n-1;x++)
        {
            ar[x]=sc.nextLine();
        }
        for(int i=0;i<=n-1;i++)
        {
            String s=ar[i];
            if(s.length()<=10)
            {
                System.out.println(s);
                continue;
            }
            else
            {
                int len=s.length();
                String s1=String.valueOf(len-2);
                String str=s.charAt(0)+s1+s.substring(len-1);
                System.out.println(str);
            }
        }
    }
    public static void main(String args[])
    {
        string ob=new string();
        ob.input();
    }
}